package appliances;

/**
 * Lernziel:
 * - Anfrufkette
 * - super() in Konstruktoren
 * - super(...)
 * - this(...) vs. super(...)
 */

public class SuperConstructor {
    public static void main(String[] args) {
        new FireAlarm();
        new Country("Panem");
    }
}

class Country {
    private final String name;

    Country(String name) {
        this.name = name;
    }
}

class Panem extends Country {
    Panem(String name) {
        super("Panem");
    }
//    Panem(String name) {
//        super(name);
//    }
}