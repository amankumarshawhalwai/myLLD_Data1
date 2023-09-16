package Concurrency;

public class Main1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("The result is: "+(a+b)+" "+Thread.currentThread().getName());
        /** This shows the main thread keeps on executing in parallel to the other thread
         * The main thread does not waits for the other threads to complete
         * */

        HelloWorldPrinter hwp= new HelloWorldPrinter();
        //hwp.run();
        /** This is still running on the main thread since
        the run method of the called class is getting executed
        */
        /** So we can simply create an object of the Thread class ANd call the start() method
         * It goes to the OS and creates a new thread=> executes and deletes the thread
         */
        Thread t1= new Thread(hwp);
        t1.start();
}}