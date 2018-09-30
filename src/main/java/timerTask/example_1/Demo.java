package timerTask.example_1;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Demo {

    public static void main(String[] args) {
        Timer mTimer = new Timer();
        MyTimerTask mMyTimerTask = new MyTimerTask();
        mTimer.schedule(mMyTimerTask, 1000, 5000);

        Random random = new Random();
        mTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                final float value = random.nextInt(35);
                System.out.println(value);
            }
        }, 0, 3500);
    }
}
