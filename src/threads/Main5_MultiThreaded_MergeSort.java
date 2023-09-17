package threads;

import java.util.ArrayList;
import java.util.List;

public class Main5_MultiThreaded_MergeSort {
    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort= new ArrayList<Integer>(){{
            add(8);add(1);add(2);add(9);add(6);add(3);add(7);add(5);
        }};

        Multithreaded_MergeSort sorter= new Multithreaded_MergeSort(arrayToSort);
        List<Integer> sortedArray= sorter.call();

        System.out.println(sortedArray);

    }
}
