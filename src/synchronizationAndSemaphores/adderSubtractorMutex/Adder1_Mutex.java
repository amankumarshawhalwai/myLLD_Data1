package synchronizationAndSemaphores.adderSubtractorMutex;


import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder1_Mutex implements Callable<Void> {
    private Value1_Mutex v;
    private Lock lock;
    public Adder1_Mutex(Value1_Mutex v,Lock lock)
    {
        this.v=v;
        this.lock=lock;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++)
        {
            lock.lock();      //Assigning the lock to the current adder thread
            this.v.value+=i;
            System.out.println("Adding "+i+" here");
            lock.unlock();     //Releasing the lock from the current adder thread
        }
        return null;
    }
}
