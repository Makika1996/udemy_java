package lambda;

import java.awt.*;
import java.math.BigDecimal;
import java.util.function.IntFunction;

/**
 * Lernziel: Konstruktorreferenzen verstehen
 */

public class ConstructorReferences {
    interface IntToBigDecimalFunction {
        BigDecimal map(int value);
    }

    public static void main(String[] args) {

        BigDecimal bigDecimal1 = new BigDecimal(100);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(100);

        IntToBigDecimalFunction function1 = value -> BigDecimal.valueOf(value);
        IntToBigDecimalFunction function2 = value -> new BigDecimal(value);
        IntToBigDecimalFunction function3 = BigDecimal::valueOf;
        IntToBigDecimalFunction function4 = BigDecimal::new;

        // int -> Objekt
        IntFunction<int[]> function5 = value -> new int[value];
        IntFunction<int[]> function6 = int[]::new;

        IntFunction<Point[]> function7 = Point[]::new;
    }
}
