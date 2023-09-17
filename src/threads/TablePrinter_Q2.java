package threads;

public class TablePrinter_Q2 implements Runnable{
    private final int num1;
    private final int num2;

    public TablePrinter_Q2(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public void run() {
        System.out.println(num1+" times "+num2+" is "+(num1*num2)+" THREAD PRINTED BY:"+
                Thread.currentThread().getName());
    }
}