package array;

public class FirstArray {
    public static void main(String[] args) {
//        int[] primes;
//        primes = new_int[5];

        /*
                        +---+---+---+---+----+
        primes +------>+  2 | 3 | 5 | 7 | 11 |
                        +---+---+---+---+----+
                          0   1   2   3   4         Index

         */

//        System.out.println(primes[999999]); // ArrayIndexOutOfBoundsException
//        System.out.println( primes[ -1 ] ); // ArrayIndexOutOfBoundsException

//        primes = null;
//        System.out.println(primes[1]);  // NullPointerException

//        printArray( primes );

        int[] newPrimes = firstPrimes();
        printArray(newPrimes);

        String[] names = new String[2];
        System.out.println(names[0]);
        names[0] = "Christian";
        names[1] = "Cora";

        printArray(names);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] firstPrimes() {
        int[] primes = new int[5];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = primes[3] + 3;
        primes[4]++;    //1

        return primes;
    }
}

