package threads;

/**
 * Print number 1 to 100 from separate threads
 * */

public class Main2_NumberPrinter {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            NumberPrinter numPrinter= new NumberPrinter(i);
            Thread t2= new Thread(numPrinter);
            t2.start();
        }
    }
}
