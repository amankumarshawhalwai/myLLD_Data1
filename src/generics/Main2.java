package generics;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();

        ArrayList<Objects> arr2= new ArrayList<>();
        /*
         * This shows whether we declare a List of type INTEGER or OBJECTS at the run time
         * it is just identified as a LIST. This can be seen from line 15 and line 16
         */
        System.out.println(arr1.getClass().getName());
        System.out.println(arr1.getClass()==arr2.getClass());
    }
}
