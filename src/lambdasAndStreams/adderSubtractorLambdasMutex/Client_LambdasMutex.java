package lambdasAndStreams.adderSubtractorLambdasMutex;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client_LambdasMutex {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Value_LambdasMutex v=new Value_LambdasMutex();
        Lock l= new ReentrantLock();

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
