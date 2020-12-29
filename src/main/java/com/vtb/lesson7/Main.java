package com.vtb.lesson7;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> System.out.println("1"));
        }
        Future<String> future = executorService.submit(() -> "Hi");
        System.out.println(future.get());
        executorService.shutdown();

    }
}
