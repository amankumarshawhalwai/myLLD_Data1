package synchronizationAndSemaphores.adderSubtractorAtomic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client1_Atomic {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value1_Atomic v= new Value1_Atomic();

        Adder1_Atomic adderAtomic= new Adder1_Atomic(v);
        Subtractor1_Atomic subtarctorAtomic= new Subtractor1_Atomic(v);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderAtomicFuture= es.submit(adderAtomic);
        Future<Void> subtractorAtomicFuture= es.submit(subtarctorAtomic);

        adderAtomicFuture.get();
        subtractorAtomicFuture.get();

        es.shutdown();
        System.out.println(v.atomicInteger.get());
    }
}
