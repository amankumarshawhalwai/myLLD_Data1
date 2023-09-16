package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4_NumberPrinter_ThreadPool {
    public static void main(String[] args) {
        ExecutorService e= Executors.newFixedThreadPool(10);
        for(int i=1;i<=10;i++)
        {
            NumberPrinter_ThreadPool numPrinter= new NumberPrinter_ThreadPool(i);

            //Thread t4= new Thread(numPrinter);
            //t4.start();
            e.execute(numPrinter);
        }
        e.shutdown();
    }
}
