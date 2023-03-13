package thread;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * Lernziel: Hintergrundoperationen mit Rückgaben
 * - Schnittstelle `Runnable` und `Callable` im Vergleich
 * - `Future`-Objekte
 */

public class CallableDemo {
    public static void main(String[] args) {
        Callable<String> reverser = new Reverser("askdjflshdfahsdfkhsdkfjlasjdflöjsaldjflsajdlfjöaaaa");
        ExecutorService executor = Executors.newCachedThreadPool();
        System.out.println(LocalTime.now());
        Future<String> future = executor.submit(reverser);
        // .....
        System.out.println(LocalTime.now());
        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
            System.out.println(LocalTime.now());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}

class Reverser implements Callable<String> {
    private final String value;

    public Reverser(String value) {
        this.value = value;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return new StringBuilder(value).reverse().toString();
    }
}