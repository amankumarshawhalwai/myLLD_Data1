package threads;

public class NumberPrinter_ThreadPool implements Runnable{
    private int numberToPrint;
    public NumberPrinter_ThreadPool(int numberToPrint)
    {
        this.numberToPrint= numberToPrint;
    }
    @Override
    public void run() {
        System.out.println(numberToPrint+" Printed by: "+Thread.currentThread().getName());
    }
}
