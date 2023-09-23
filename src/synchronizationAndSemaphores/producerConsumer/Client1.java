package synchronizationAndSemaphores.producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client1 {
    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();
        Store1 store1= new Store1(5);//Denotes there are 5 slots for the Producers to fil

        for(int i=1;i<=8;i++){  // There are 8 producers
            es.execute(new Producer1(store1));
        }
        for(int i=1;i<=20;i++) // There are 20 Consumers. It cam be changed as well
        {
            es.execute(new Consumer1(store1));
        }
        es.shutdown();
    }
}
