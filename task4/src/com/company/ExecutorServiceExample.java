package com.company;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public ExecutorServiceExample(int count) {

        ExecutorService executor = Executors.newFixedThreadPool(count);
        System.out.println("Start");
        executor.execute(new IThread("Alex"));
        executor.execute(new IThread("Ann"));
        executor.execute(new IThread("Alla"));
        executor.execute(new IThread("Kate"));
        executor.execute(new IThread("Emma"));
        executor.shutdown();
        System.out.println("End");
    }
}