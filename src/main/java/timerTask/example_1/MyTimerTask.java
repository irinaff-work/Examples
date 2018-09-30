package timerTask.example_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "dd:MMMM:yyyy HH:mm:ss a", Locale.getDefault());
        final String strDate = simpleDateFormat.format(calendar.getTime());
        System.out.println("strDate= " + strDate);
    }
}
