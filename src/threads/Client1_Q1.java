package threads;

/**
 * Question 1 for threads Adder and Subtractor
 * The Adder_Q1 and Subtractor_Q1 classes are being used here
 */
public class Client1_Q1 {
    public static void main(String[] args) {
        System.out.println("This is the Client1_Q1 class. I am the boss here");
        new Thread(new Adder_Q1()).start();
        new Thread(new Subtractor_Q1()).start();
    }
}
