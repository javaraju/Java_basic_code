package interview2023.java.Executer;

import java.util.concurrent.*;

public class CollableDemo {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        Callable<String> aCallable = () -> "My first callable....";

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> aFuture1 = executorService.submit(aCallable);
        Future<Integer> aFuture2 = executorService.submit(new CallableClient(10));

        System.out.println(aFuture1.get());
        System.out.println(aFuture2.get());
    }
}
