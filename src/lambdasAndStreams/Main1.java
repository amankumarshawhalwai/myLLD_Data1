package lambdasAndStreams;

public class Main1 {
    public static void main(String[] args) {
        // VERSION 1
        Thread s1= new Thread(new GetSomethingDone());
        s1.start();

        //VERSION 2
        Runnable r= ()->{
            System.out.println("I will get this done version 2 !!");
        };
        new Thread(r).start();

        //VERSION 3
        Thread s2= new Thread(
                ()->{
                    System.out.println("I will get this done version 3 !!");
                }
        );
        s2.start();

        //VERSION 4
        new Thread(
                ()->{
                    System.out.println("I will get this done version 4 !!");
                }
        ).start();
    }
}
