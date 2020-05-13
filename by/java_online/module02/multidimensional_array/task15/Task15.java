/*
 * Найдите наибольший элемент матрицы и заменить
 * все нечетные элементы на него.
 */

package by.java_online.module02.multidimensional_array.task15;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 18, 56, 4, 11},
                          {5, 13, 16, 91, 90},
                          {18, 8, 26, 29, 38}};

        // Находим наибольший элемент
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // Заменяем нечетные элементы на наибольший и выводим матрицу
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
