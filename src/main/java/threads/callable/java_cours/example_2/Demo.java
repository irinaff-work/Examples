package threads.callable.java_cours.example_2;

import threads.callable.habr_post.example_3.MyCallable;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //executorService.submit(new MyCallable());
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() {
            return "2";
        }
    }

}
