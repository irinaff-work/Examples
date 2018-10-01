package threads.runnable.example_5;

public class Demo {
    public static void main(String[] args) {
        ResourseA resourseA = new ResourseA();
        ResourseB resourseB = new ResourseB();
        resourseB.resourseA = resourseA;
        resourseA.resourseB = resourseB;
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.resourseA = resourseA;
        thread2.resourseB = resourseB;
        thread1.start();
        thread2.start();
    }
}

class MyThread1 extends Thread {
    ResourseA resourseA;

    @Override
    public void run() {
        System.out.println(resourseA.getI());
    }
}

class MyThread2 extends Thread {
    ResourseB resourseB;

    @Override
    public void run() {
        System.out.println(resourseB.getI());
    }
}

class ResourseA {
    ResourseB resourseB;

    public synchronized int getI() {
        return resourseB.returnI();
    }

    public synchronized int returnI() {
        return 1;
    }
}

class ResourseB {
    ResourseA resourseA;

    public synchronized int getI() {
        return resourseA.returnI();
    }

    public synchronized int returnI() {
        return 1;
    }
}
