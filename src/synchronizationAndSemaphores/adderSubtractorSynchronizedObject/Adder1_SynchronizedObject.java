package synchronizationAndSemaphores.adderSubtractorSynchronizedObject;

import java.util.concurrent.Callable;

/**
 * Making use of the synchronized keyword. Since the Critical Section(CS) is here
 * The synchronized keyword works same like the lock.lock() and lock.unlock()
 * Here, it is getting applied on the Object
 */

public class Adder1_SynchronizedObject implements Callable<Void> {
    private Value1_SynchronizedObject v;
    public Adder1_SynchronizedObject(Value1_SynchronizedObject v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000000;i++)
        {
            synchronized(v){
            v.value+=i;
        }}
        return null;
    }
}
