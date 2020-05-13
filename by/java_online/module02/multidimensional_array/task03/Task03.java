/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.java_online.module02.multidimensional_array.task03;

public class Task03 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 8, 7, 6},
                          {5, 4, 3, 2}};

        int k = 2;
        int p = 1;

        // Проверяем, чтобы номера строки и столбца соответствовали границам
        if (k > matrix.length | p > matrix[0].length | k <= 0 | p <= 0) {
            System.out.println("Check row and column numbers.\n" +
                               "Minimum row and column number - 1\n" +
                               "Maximum row number - " + (matrix.length - 1) + "\n" +
                               "Maximum column number - " + (matrix[0].length - 1));
            return;
        }

        // Выводим строку
        System.out.println("Row number " + k);
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[k-1][j] + " ");
        }

        System.out.println();

        // Выводим столбец
        System.out.println("Column number " + p);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][p-1]);
        }
    }
}
