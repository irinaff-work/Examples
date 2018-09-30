package threads.runnable.example_1;

/**
 * В следующем примере поток успешно поспит 2 раза, но третий сон будет прерван.
 * Метод sleep2sec узнает об этом, но утаит эту информацию.
 * Поэтому, поток будет выполнятся бесконечно, несмотря на проверку isInterrupted().
 * Тут есть 2 решения:
 1. Пробросить исключение.
 2. Снова установить флаг прерывания: Thread.currentThread().interrupt()
 в catch-секции, чтобы условие цикла выполнилось.
 */
public class CatLife{

    final public static void main(String[]args) throws InterruptedException{
        Thread cat = new Thread(new Cat());
        cat.start();
        Thread.sleep(5000);
        cat.interrupt();
        cat.join();
    }

    static class Cat implements Runnable{

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Сон начинается");
                sleep2sec();
                System.out.println("Сон закончился\n");
            }
            System.out.println("Завершение работы потока");
        }

        private void sleep2sec(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Сон прерван");
                //Thread.currentThread().interrupt(); //1
                //throw(e);//+throws InterruptedException
            }
        }

    }

}
