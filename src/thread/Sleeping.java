package thread;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * Lernziel: Schlafen und Zeiteinheiten
 * - `Thread#sleep(...)`
 * - `TimeUnit`
 */

public class Sleeping {
    public static void main(String[] args) {

        System.out.println(LocalTime.now());
        try {
//            Thread.sleep(2000);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // Empty
        }
        System.out.println(LocalTime.now());

        // Tage -> Sekunden
        System.out.println(TimeUnit.DAYS.toSeconds(2)); // 172800


        long ns = 7326578346L;
        System.out.println(TimeUnit.NANOSECONDS.toMillis(ns)); // 7326
    }
}
