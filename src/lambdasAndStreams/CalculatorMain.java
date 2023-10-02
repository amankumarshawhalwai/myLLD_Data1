package lambdasAndStreams;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorOps add=(a,b)-> a+b;
        CalculatorOps sub=(a,b)-> a-b;
        CalculatorOps multi=(a,b)-> a*b;
        CalculatorOps div=(a,b)-> a/b;
        CalculatorOps mod=(a,b)->a%b;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A:");
        int A=sc.nextInt();
        System.out.println("Enter B:");
        int B=sc.nextInt();

        System.out.println("Addition result: "+add.operate(A,B));
        System.out.println("Subtraction result: "+sub.operate(A,B));
        System.out.println("Multiplication result: "+multi.operate(A,B));
        System.out.println("Division result: "+div.operate(A,B));
        System.out.println("Modulo result: "+mod.operate(A,B));
    }
}
