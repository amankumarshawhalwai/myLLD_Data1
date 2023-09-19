package synchronizationAndSemaphores.adderSubtractorSynchronizedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * In this example, we are making use of the Synchronized Method
 * And Shifting the CS to the Object that is used in common
 */
public class Client1_SynchronizedMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value1_SynchronizedMethod v= new Value1_SynchronizedMethod();
        Adder1_SynchronizedMethod adderSynchronized= new Adder1_SynchronizedMethod(v);
        Subtractor1_SynchronizedMethod subtractorSynchronized= new Subtractor1_SynchronizedMethod(v);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderSynchronizedFuture= es.submit(adderSynchronized);
        Future<Void> subtractorSynchronizedFuture= es.submit(subtractorSynchronized);

        adderSynchronizedFuture.get();
        subtractorSynchronizedFuture.get();
        es.shutdown();

        System.out.println(v.getValue());
    }
}
