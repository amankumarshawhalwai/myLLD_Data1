package synchronizationAndSemaphores.assignments;

/**
 * Write code to achieve the following
 * A class Client with a main method.
 * Create a class ArrayCreator which takes as input a number (n)
 * ArrayCreator should create an ArrayList which should contain numbers from 1 to n
 * ArrayCreator should implement appropriate Callable interface and return the arraylist discussed above to calling thread
 * Client class should invoke ArrayCreator over a new thread and get the arraylist from ArrayCreator class and print it.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client1_Q1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range:");
        int n= sc.nextInt();

        ArrayCreator_Q1 ac= new ArrayCreator_Q1(n);
        ExecutorService es= Executors.newCachedThreadPool();

        Future<ArrayList<Integer>> arrayListFuture = es.submit(ac);
        ArrayList<Integer> res= arrayListFuture.get();
        es.shutdown();
        System.out.println("The generated array is:");
        System.out.println(res);
    }
}
