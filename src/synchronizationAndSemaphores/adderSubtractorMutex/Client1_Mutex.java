package synchronizationAndSemaphores.adderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implementation of Adder subtractor using the Mutex Locks
 * Using an object instead of a global variable so that it can be used across classes within a package
 */
public class Client1_Mutex {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock= new ReentrantLock();// Creating an object of Mutex Lock
        Value1_Mutex v= new Value1_Mutex();

        Adder1_Mutex adderMutex= new Adder1_Mutex(v,lock);
        Subtractor1_Mutex subtractorMutex= new Subtractor1_Mutex(v,lock);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderMutexFuture= es.submit(adderMutex);
        Future<Void> subtractorMutexFuture= es.submit(subtractorMutex);

        adderMutexFuture.get();
        subtractorMutexFuture.get();
        es.shutdown();
        System.out.println(v.value);
    }
}
