package synchronizationAndSemaphores.producerConsumer;

public class Producer1 implements Runnable{
    private Store1 store1;
    public Producer1(Store1 store1)
    {
        this.store1=store1;
    }
    @Override
    public void run() {
        while(true)
        {
            synchronized (store1)
            {
                if(store1.getItems().size()< store1.getMaxsize())
                    store1.addItem();
            }
        }
    }
}
