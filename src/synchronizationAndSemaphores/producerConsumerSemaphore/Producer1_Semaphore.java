package synchronizationAndSemaphores.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer1_Semaphore implements Runnable{
    private Store1_Semaphore store1_Sema;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    public Producer1_Semaphore(Store1_Semaphore store1_Sema,Semaphore prodSemaphore,Semaphore consSemaphore){
        this.store1_Sema=store1_Sema;
        this.prodSemaphore=prodSemaphore;
        this.consSemaphore=consSemaphore;
    }
    @Override
    public void run() {
        while(true)
        {
            try {
                prodSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store1_Sema.getItems().size()< store1_Sema.getMaxsize()){
                    store1_Sema.addItems();
            }
            consSemaphore.release();
        }
    }
}
