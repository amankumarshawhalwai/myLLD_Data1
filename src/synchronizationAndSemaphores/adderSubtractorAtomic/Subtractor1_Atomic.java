package synchronizationAndSemaphores.adderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Subtractor1_Atomic implements Callable<Void> {
    private Value1_Atomic v;
    public Subtractor1_Atomic(Value1_Atomic v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++)
        {
            this.v.atomicInteger.getAndAdd(-i);
        }
        return null;
    }
}
