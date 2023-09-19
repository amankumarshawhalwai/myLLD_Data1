package synchronizationAndSemaphores.adderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;

public class Subtractor1_SynchronizedMethod implements Callable<Void> {
    private Value1_SynchronizedMethod v;
    public Subtractor1_SynchronizedMethod(Value1_SynchronizedMethod v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000000;i++){
        this.v.decrementBy(i);
        }
        return null;
    }
}
