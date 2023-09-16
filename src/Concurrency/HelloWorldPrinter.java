package Concurrency;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World from run "+ Thread.currentThread().getName());
        doSomething();
    }
    private void doSomething()
    {
        System.out.println("Let's do something from doSomething. "+
                Thread.currentThread().getName());
    }
}
