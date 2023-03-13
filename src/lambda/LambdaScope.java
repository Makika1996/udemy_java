package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

/**
 * Lernziel: Die Umgebung der Lambda-Ausdrücke und Variablenzugriffe
 * - effectively final
 * - Zustände verändern über Container
 * - `this` -Referenz
 * - Ausnahmen in Lambda-Ausdrücken
 */

public class LambdaScope {
    public static void main(String[] args) throws IOException {
        boolean shouldTrim = true;
//        shouldTrim = false;
        Predicate<String> isEmpty = s -> {
            System.out.println(1 / 0);
//            System.out.println(this); CF
            return shouldTrim ? s.trim().isEmpty() : s.isEmpty();
        };
        isEmpty.test("");

        Predicate<String> isEmpty2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println(this);
                return shouldTrim ? s.trim().isEmpty() : s.isEmpty();
            }
        };

        Predicate<Path> isEmptyFile = (Path path) -> {
            try {
                return Files.size(path) == 0;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}