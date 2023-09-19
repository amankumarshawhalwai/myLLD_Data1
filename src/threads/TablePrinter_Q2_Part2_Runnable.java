package threads;

public class TablePrinter_Q2_Part2_Runnable implements Runnable{
    private final int num;
    public TablePrinter_Q2_Part2_Runnable(int num)
    {
        this.num=num;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println(this.num+" times "+i+" is "+(this.num*i));
        }
    }
}
