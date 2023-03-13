package lang;

/**
 * Lernziel: Aufzählungen mit Eigenschaften
 * - Statische Methoden deklarieren
 * - Objektmethoden deklarieren
 * - Konstruktoren ergänzen
 */

public class JavaLangEnum {
    public static void main(String[] args) {
        Country germany = Country.GERMANY;
        /*
        http://www.javadecompilers.com
         */

    }
}

enum Country {
    GERMANY, UK, CHINA
}

//final class Country extends Enum {
//    public static Country[] values() {
//        return (Country[])$VALUES.clone();
//    }
////    public static Country valueOf(String name){
////        return (Country)Enum.valueOf(de/tutego)
////    }
//    private Country(String s, int i) {
//        super(s, i);
//    }
//
//    private static Country[] $values() {
//        return (new Country[]{
//                GERMANY, UK, CHINA
//        });
//    }
//
//    public static final Country GERMANY = new Country("GERMANY", 0);
//    public static final Country UK = new Country("UK", 1);
//    public static final Country CHINA = new Country("CHINA", 2);
//    private static final Country $VALUES[] = $values();
//
//}