package javaselib;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Lernziel: Ganz zufällig
 * - `Math.random()`
 * - `Random`
 * - `SecureRandom`
 * - `ThreadLocalRandom`
 * - `UUID`
 */

public class RandomThings {
    public static void main(String[] args) {
        Random random = new Random(0);
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(11));

        //SecureRandom
        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.getAlgorithm()); //DRBG = Deterministic Random Bit Generator

        //ThreadLocalRandom
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.nextInt();

        //UUID = Universally Unique Identifier
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());

    }
}
