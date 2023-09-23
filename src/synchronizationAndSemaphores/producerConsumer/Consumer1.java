package synchronizationAndSemaphores.producerConsumer;

public class Consumer1 implements Runnable{
    private Store1 store1;
    public Consumer1(Store1 store1)
    {
        this.store1=store1;
    }
    @Override
    public void run() {
        while(true)
        {
            synchronized (store1)
            {
                if(store1.getItems().size()>0)
                {
                    store1.removeItem();
                }
            }
        }
    }
}
