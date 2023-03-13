package thread;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Lernziel: `Timer` und `TimerTask`
 * - Klasse `Timer`
 * - abstrakte Klasse `TimerTask`
 */

public class TimerAndTimerTask {
    public static void main(String[] args) {
        class MyTimerTask extends TimerTask {

            @Override
            public void run() {
                System.out.println("TimerTask " + LocalTime.now());
            }
        }
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 0, 2000);
        System.out.println("main() " + LocalTime.now());
    }
}
