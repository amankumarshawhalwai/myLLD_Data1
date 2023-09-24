package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * If we try to add null to the queue, then it compiles because of the Queue Interface.
 * But we will get error at the runtime since ArrayDeque does not allow any null
 * SINCE, WE CANNOT COMPARE NULLS and ArrayDeque() does not allow null since there is a method called
 * getLast() which returns null if no element is found. And this is a bas code design
 */
public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q1= new ArrayDeque<>();
        q1.add(12);q1.add(5);
        q1.add(6);
        //q1.add(null);

        for(Integer i: q1)
            System.out.println(i);
    }
}
