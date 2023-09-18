package threads;
import java.util.*;

/**
 * 2 Inputs taken from the user
 * Print the sum of the 2 numbers using a thread
 * Adder_Q3 is the class called from this client class
 * */

public class Client3_Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1= sc.nextInt();
        System.out.println("Enter the second number:");
        int n2= sc.nextInt();

        /**
         * Creating a thread and Adder_Q3 object
         * and passing the two numbers as the parameters
         */
        new Thread(new Adder_Q3(n1,n2)).start();
    }
}
