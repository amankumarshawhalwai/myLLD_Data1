package synchronizationAndSemaphores.adderSubtractorSynchronizedObject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Here, we are making use of the synchronized keyword on the object within the CS classes
 */
public class Client1_SynchronizedObject {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value1_SynchronizedObject v= new Value1_SynchronizedObject();
        Adder1_SynchronizedObject adderSynchronized= new Adder1_SynchronizedObject(v);
        Subtractor1_SynchronizedObject subtractorSynchronized= new Subtractor1_SynchronizedObject(v);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderSynchronizedFuture= es.submit(adderSynchronized);
        Future<Void> subtractorSynchronizedFuture= es.submit(subtractorSynchronized);

        adderSynchronizedFuture.get();
        subtractorSynchronizedFuture.get();
        es.shutdown();

        System.out.println(v.value);
    }
}
