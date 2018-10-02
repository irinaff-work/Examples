package threads.runnable.example_8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    public static void main(String[] args) {
        Resourse resorce = new Resourse();
        resorce.i = 5;
        resorce.j = 5;
        MyThread myThread = new MyThread();
        myThread.setName("one");
        MyThread myThread1 = new MyThread();
        myThread.resorce = resorce;
        myThread1.resorce = resorce;
        myThread.start();
        myThread1.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resorce.i);
        System.out.println(resorce.j);
    }

    static class MyThread extends Thread {
        Resourse resorce;

        @Override
        public void run() {
            resorce.changeI();
            resorce.changeJ();
        }
    }
}

class Resourse {
    int i;
    int j;

    Lock lock = new ReentrantLock();

    void changeI() {
        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }

    void changeJ() {
        int j = this.j;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }
}
