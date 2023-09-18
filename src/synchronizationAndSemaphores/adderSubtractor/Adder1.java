package synchronizationAndSemaphores.adderSubtractor;

import java.util.concurrent.Callable;

/**
 * Callable is used here since it has the get() method
 * We want to make changes on one than the other would make
 */
public class Adder1 implements Callable<Void> {
    private Value1 v;
    public Adder1(Value1 v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++)
        {
            this.v.value+=i;
        }
        return null;
    }
}
