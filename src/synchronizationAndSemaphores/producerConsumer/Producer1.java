package synchronizationAndSemaphores.producerConsumer;

/**
 * Runnable Interface is used since these classes do
 * not need to return any thing to the Client caller class
 */
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
            synchronized(store1) {
                if (store1.getItems().size() < store1.getMaxsize()) {
                    store1.addItem();
                }
            }
        }
    }
}