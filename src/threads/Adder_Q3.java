package threads;

import java.sql.SQLOutput;

public class Adder_Q3 implements Runnable{
    private final int num1;
    private final int num2;
    public Adder_Q3(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public void run() {
        System.out.println("The Sum of "+num1+" and "+num2+" is: "+(num1+num2));
        System.out.println("Executed By: "+Thread.currentThread().getName());
    }
}
