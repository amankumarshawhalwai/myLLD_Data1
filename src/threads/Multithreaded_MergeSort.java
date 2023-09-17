package threads;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Multithreaded_MergeSort implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    public Multithreaded_MergeSort(List<Integer> arrayToSort)
    {
        this.arrayToSort=arrayToSort;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        List<Integer> leftArray= new ArrayList<>();
        List<Integer> rightArray= new ArrayList<>();
        int len=arrayToSort.size();
        int mid= len/2;

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<len;i++){
            rightArray.add(arrayToSort.get(i));
        }
        ExecutorService es= Executors.newCachedThreadPool();
        Multithreaded_MergeSort leftArrayTask= new Multithreaded_MergeSort(leftArray);
        Multithreaded_MergeSort rightArrayTask= new Multithreaded_MergeSort(rightArray);

        Future<List<Integer>> leftArrayFuture= es.submit(leftArrayTask);
        Future<List<Integer>> rightArrayFuture= es.submit(rightArrayTask);

        List<Integer> sortedLeftArray= leftArrayFuture.get();
        List<Integer> sortedRightArray= rightArrayFuture.get();

        int i=0;
        int j=0;
        List<Integer> sortedArray= new ArrayList<>();
        while(i<sortedLeftArray.size() && j<sortedRightArray.size())
        {
            if(sortedLeftArray.get(i)<=sortedRightArray.get(j)){
                sortedArray.add(sortedLeftArray.get(i));
                i+=1;
            }
            else{
                sortedArray.add(sortedRightArray.get(j));
                j+=1;
            }
        }
        while(i<sortedLeftArray.size())
        {
            sortedArray.add(sortedLeftArray.get(i));
            i+=1;
        }
        while(j<sortedRightArray.size())
        {
            sortedArray.add(sortedRightArray.get(j));
            j+=1;
        }
        es.shutdown();
        return sortedArray;
    }
}
