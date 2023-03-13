package lang;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Lernziel: Klasse ´Optional´
 * - ´null´ vs. ´Optional´
 * - ´Optional´ aufbauen und erfragen
 */

public class JavaUtilOptional {
    public static void main(String[] args) {

        /*
        Einsatz von null:
        1. Variablen initialisieren
        2. null als Default-Wert bei Parametern
        3. null in der Rückgabe
         */
        /*
        Aber ist das gewollt oder ungewollt?
         */
        /*

         */
        Optional<Object> empty = Optional.empty();
        Optional<String> result = Optional.of("Rückgabe");
        Optional<Object> empty2 = Optional.ofNullable(null);
        Optional<String> result2 = Optional.ofNullable("Rückgabe2");
        System.out.println(empty.isPresent());
        System.out.println(result.isPresent());
        System.out.println(empty2.isPresent());
        System.out.println(result2.isPresent());
        System.out.println(empty.isEmpty());
        System.out.println(result.isEmpty());
        System.out.println(empty2.isEmpty());
        System.out.println(result2.isEmpty());

        System.out.println(result.get());
        System.out.println(result.orElse("Default sieht man aber nicht"));
        System.out.println(empty.orElse("Default"));

        Person heinz = new Person();
        System.out.println(heinz.getSpouse());
    }

    static OptionalInt max(int... values) {
        if (values.length == 0)
            return OptionalInt.empty();
        return OptionalInt.of(Integer.MAX_VALUE);
    }
}

class Person {
    private Person spouse;

    public void setSpouse(Person spouse) {
        this.spouse = Objects.requireNonNull(spouse);
    }

    void removeSpouse() {
        spouse = null;
    }

    public Optional<Person> getSpouse() {
        return Optional.ofNullable(spouse);
    }
}
