package synchronizationAndSemaphores.adderSubtractor;

import threads.Subtractor_Q1;

import java.util.concurrent.Callable;

public class Subtractor1 implements Callable<Void> {
    private Value1 v;
    public Subtractor1(Value1 v)
    {
        this.v=v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++)
        {
            this.v.value-=i;
        }
        return null;
    }
}
