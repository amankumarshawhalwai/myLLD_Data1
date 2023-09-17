package threads;
import java.util.*;

/**
 * Print table from 1 to 10 for a number using threads
 * The TablePrinter_Q2 class's object is called and used here
 */
public class Client2_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            new Thread(new TablePrinter_Q2(num,i)).start();
        }
    }
}