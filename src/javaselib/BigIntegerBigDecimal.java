package javaselib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Lernziel: Große Ganz und -Fließkommazahlen
 * - `BigInteger`
 * - `BigDecimal`
 */

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        //BigInteger

        // int -> 4 Byte
        // long -> 8 Byte

        BigInteger bigInteger = new BigInteger("101010100010011111111111101100101010111111100100010000100001", 2);
        System.out.println(bigInteger.longValueExact());

        System.out.println(BigInteger.valueOf(10_000_000L).gcd(new BigInteger("50000")));

        //BigDecimal

        BigDecimal bigDecimal1 = new BigDecimal("7474.230987654421345555870");
        BigDecimal bigDecimal2 = new BigDecimal(7474.2309876544213398473043453453445555870);
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);

        System.out.println(BigDecimal.ONE.divide(new BigDecimal("3"), new MathContext(10, RoundingMode.CEILING)));
    }
}
