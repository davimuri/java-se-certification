package certification.java11.threads;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        Callable<String> callable = () -> "Hello";
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(callable);

        try {
            System.out.println(future.get(2, TimeUnit.SECONDS));
            String val = executorService.invokeAny(List.of(callable));
            System.out.println(val);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

    }
}
