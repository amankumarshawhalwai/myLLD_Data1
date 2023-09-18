package synchronizationAndSemaphores.adderSubtractor;

/**
 * We are using a object of Value since we need to make changes to the same variable
 * by two different threads. So, instead of using a global variable we use object.
 * Since, it is not a good practice.
 */
public class Value1 {
    public int value=0;

}
