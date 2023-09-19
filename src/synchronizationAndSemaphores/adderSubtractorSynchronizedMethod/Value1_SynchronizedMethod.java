package synchronizationAndSemaphores.adderSubtractorSynchronizedMethod;

/**
 * To solve this problem of synchronized method
 * we need to make changes to the object that is being employed for the purpose
 * Earlier, the Critical Section was on the Adder and Subtractor class
 * And now the CS is in this class so 'synchronized' keyword is declared here
 */
public class Value1_SynchronizedMethod {
    private int value=0;

    public synchronized void incrementBy(int num)
    {
        this.value+=num;
    }
    public synchronized void decrementBy(int num)
    {
        this.value-=num;
    }
    public int getValue()
    {
        return value;
    }
}
