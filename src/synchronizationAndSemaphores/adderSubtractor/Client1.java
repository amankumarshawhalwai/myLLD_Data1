package synchronizationAndSemaphores.adderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value1 v = new Value1();
        Adder1 a1= new Adder1(v);
        Subtractor1 s1= new Subtractor1(v);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderFuture= es.submit(a1);
        Future<Void> subtractorFuture= es.submit(s1);

        adderFuture.get();
        subtractorFuture.get();
        System.out.println(v.value);
    }
}
