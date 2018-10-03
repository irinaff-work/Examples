package threads.callable.java_cours.example_4;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);
        Person person1 = new Person(table);
        Person person2 = new Person(table);
        Person person3 = new Person(table);
        Person person4 = new Person(table);
        Person person5 = new Person(table);
        Person person6 = new Person(table);
        Person person7 = new Person(table);

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
        person6.start();
        person7.start();
    }
}

class  Person extends Thread {
    Semaphore table;

    Person(Semaphore sem) {
        this.table = sem;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() + " eat the table");
            this.sleep(1000);
            System.out.println(this.getName() + " release table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
