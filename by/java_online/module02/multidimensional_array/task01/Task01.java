/*
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых первый элемент больше последнего.
 */

package by.java_online.module02.multidimensional_array.task01;

public class Task01 {
    public static void main(String[] args) {
        int[][] matrix = {{8, 5, 5, 4, 5, 3},
                          {1, 9, 4, 4, 3, 2},
                          {1, 6, 1, 5, 4, 2}};

        for (int i = 0; i < matrix.length; i++) {
            boolean condition = false;

            for (int j = 0; j < matrix[0].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + " ");
                    condition = true;
                }
            }

            if (condition == false) {
                System.out.println("There are no odd columns where " +
                                   "the first element is greater than the last");

                break;
            } else {
                System.out.println();
            }
        }
    }
}
