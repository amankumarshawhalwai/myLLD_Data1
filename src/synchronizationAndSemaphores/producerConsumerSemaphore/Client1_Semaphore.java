package synchronizationAndSemaphores.producerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client1_Semaphore {
    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();
        Store1_Semaphore store1_Sema= new Store1_Semaphore(5);
        Semaphore prodSemaphore= new Semaphore(5);
        Semaphore consSemaphore= new Semaphore(0);

        for(int i=1;i<=8;i++)
        {
            es.execute(new Producer1_Semaphore(store1_Sema,prodSemaphore,consSemaphore));
        }
        for(int i=1;i<=20;i++)
        {
            es.execute(new Consumer1_Semaphore(store1_Sema,prodSemaphore,consSemaphore));
        }
    }
}
