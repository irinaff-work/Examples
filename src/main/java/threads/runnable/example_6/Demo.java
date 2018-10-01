package threads.runnable.example_6;

public class Demo {
    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
        try {
            synchronized (threadB) {
                threadB.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadB.total);
    }

    static class ThreadB extends Thread {
        int total;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();
            }

        }
    }
}
