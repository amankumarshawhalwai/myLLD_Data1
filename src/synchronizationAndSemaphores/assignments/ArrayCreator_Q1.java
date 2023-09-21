package synchronizationAndSemaphores.assignments;

import java.util.concurrent.Callable;
import java.util.ArrayList;
public class ArrayCreator_Q1 implements Callable<ArrayList<Integer>> {
    private int n;
    private ArrayList<Integer> arr= new ArrayList<>();
    public ArrayCreator_Q1(int n)
    {
        this.n=n;
    }
    @Override
    public ArrayList<Integer> call() throws Exception {
        for(int i=0;i<n;i++)
        {
            arr.add(i+1);
        }
        return arr;
    }
}
