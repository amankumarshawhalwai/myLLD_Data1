package lambdasAndStreams.adderSubtractorLambdasMutex;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client_LambdasMutex {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Value_LambdasMutex v=new Value_LambdasMutex();
        Lock l= new ReentrantLock();

        /**
         * Working of Lambda Expressions
         * step 1: Creates an anonymous class of adderLambMutex
         * step 2: It will implement Callable<Void>
         * step 3: It will pass all the variables from the current scope to class
         * step 4: It will copy all the code from the lambda body to the interface method
         */
        Callable<Void> adderLambMutex= ()->{
            for(int i=1;i<=5000;i++)
            {
                l.lock();
                v.value+=i;
                l.unlock();
            }
            return null;
        };
        Callable<Void> subtractLambMutex=()->{
            for(int i=1;i<=5000;i++)
            {
                l.lock();
                v.value-=i;
                l.unlock();
            }
            return null;
        };
        ExecutorService es= Executors.newCachedThreadPool();
        Future<Void> adderLambMutexFuture= es.submit(adderLambMutex);
        Future<Void> subtractLambMutesFuture= es.submit(subtractLambMutex);

        adderLambMutexFuture.get();
        subtractLambMutesFuture.get();
        System.out.println(v.value);
        es.shutdown();
    }
}
