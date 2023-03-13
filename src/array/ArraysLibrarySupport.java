package array;

public class ArraysLibrarySupport {
    public static void main(String[] args) {

        // 1. [] =, []
        // 2. public final length
        // 3. clone()

        int[] numbers = {12, 3, 4, 5};
        int[] clone = numbers.clone();
        System.out.println(clone[0]);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrix2 = matrix.clone();
        System.out.println(matrix == matrix2);  // false
        System.out.println(matrix[0] == matrix2[0]);   //true

        // 4. Serialisierung

        // java.lang.System
        // java.util.Arrays

        String[] names = {"Peter", "Paul"};
        String[] copyNames = new String[10];

        System.arraycopy(names, 0, copyNames, 0, 2);
        System.out.println(copyNames[0]);
        System.out.println(copyNames[1]);

    }
}
