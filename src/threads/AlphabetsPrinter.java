package threads;

public class AlphabetsPrinter implements Runnable{
    private char alphabet;
    public AlphabetsPrinter(char alphabet)
    {
        this.alphabet=alphabet;
    }
    @Override
    public void run() {
        System.out.println(alphabet+ "  printed by: "+Thread.currentThread().getName());
    }
}
