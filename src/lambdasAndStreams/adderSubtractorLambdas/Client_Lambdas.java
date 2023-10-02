package lambdasAndStreams.adderSubtractorLambdas;

import java.util.concurrent.*;

public class Client_Lambdas {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Value_Lambdas v= new Value_Lambdas();

        ExecutorService es= Executors.newCachedThreadPool();
        Callable<Void> adderLamb=()->{
            for(int i=1;i<=5000;i++)
            {
                v.value+=i;
            }
            return null;
        };
        Callable<Void> subtractLamb=()->{
            for(int i=1;i<=5000;i++)
            {
                v.value-=i;
            }
            return null;
        };

        Future<Void> adderFuture= es.submit(adderLamb);
        Future<Void> subtractorFuture= es.submit(subtractLamb);

        adderFuture.get();
        subtractorFuture.get();
        System.out.println(v.value);
        es.shutdown();
    }
}
