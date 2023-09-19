package threads;

import java.util.Scanner;

public class Client2_Q2_Part2_Runnable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            new Thread(new TablePrinter_Q2_Part2_Runnable(i)).start();
        }
    }
}
