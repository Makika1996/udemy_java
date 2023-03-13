package lambda;

import java.util.LinkedList;

/**
 * Lernziel: Paket `java.util.function`
 * - Grundtypen: `Consumer`, `Supplier`, `Function`, `Operator`
 * - Funktionen für Referenztypen und primitive Typen
 */

public class JavaUtilFunction {
    public static void main(String[] args) {
        UpnCalc upnCalc = new UpnCalc();
        upnCalc.pop(10);
        upnCalc.pop(20);
        upnCalc.pop(5);
        System.out.println(upnCalc);
        upnCalc.binary(UpnCalc.addition);
        System.out.println(upnCalc);
        upnCalc.binary(UpnCalc.addition);
        System.out.println(upnCalc);

    }
}

@FunctionalInterface
interface BinaryOperation {
    int operation(int value1, int value2);
}

class UpnCalc {
    static BinaryOperation addition = (value1, value2) -> value1 + value2;
    private final LinkedList<Integer> numbers = new LinkedList<>();

    void pop(int number) {
        numbers.add(number);
    }

    void binary(BinaryOperation binaryOperation) {
        int value2 = numbers.removeLast();
        int value1 = numbers.removeLast();
        int result = binaryOperation.operation(value1, value2);
        pop(result);
    }

    @Override
    public String toString() {
        return "UpnCalc{" +
               "numbers=" + numbers +
               '}';
    }
}

