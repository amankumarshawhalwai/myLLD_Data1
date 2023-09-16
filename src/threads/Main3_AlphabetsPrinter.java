package threads;

public class Main3_AlphabetsPrinter {
    public static void main(String[] args) {

        for(int i=65;i<=90;i++)
        {
            AlphabetsPrinter alpha= new AlphabetsPrinter((char)i);
            Thread t3= new Thread(alpha);
            t3.start();
        }
    }
}
