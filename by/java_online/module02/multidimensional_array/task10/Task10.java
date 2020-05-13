/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

package by.java_online.module02.multidimensional_array.task10;

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 8, -7, 6},
                          {5, 4, 3, 2}};

        int counter = 0;  // Подсчитывает количество положительных элементов

        System.out.println("Positive elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + "; ");
                    counter += 1;
                }

            }
        }

        // Если положительных элементов нет, выводим об этом сообщение
        if (counter == 0) {
            System.out.println("The main diagonal doesn't have " +
                               "positive elements");
        }
    }
}
