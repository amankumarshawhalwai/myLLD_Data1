package synchronizationAndSemaphores.adderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;

/**
 * Here, if we make the use of concept of Synchronized method
 * If we declare the adder method synchronized then also we will not get the correct answer
 * The same reason applies to Subtractor class as well
 */
public class Adder1_SynchronizedMethod implements Callable<Void> {
    private Value1_SynchronizedMethod v;
    public Adder1_SynchronizedMethod(Value1_SynchronizedMethod v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000000;i++)
        {
            this.v.incrementBy(i);
        }
        return null;
    }
}
