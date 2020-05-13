/*
 *  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

package by.java_online.module02.multidimensional_array.task13;

public class Task13 {
    public static void main(String[] args) {
        int [][] matrix = {{-4, 5, 8, 9, 25},
                           {6, 2, -1, 3, 17},
                           {3, 17, 2, 8, 7},
                           {4, 9, 1, 1, 9}};

        /*
         * Сортируем строки по возрастанию.
         * Для сортировки по убыванию -  в строке 25 должно быть
         * matrix[i][j] < matrix[i + 1][j]
         */

        for (int j = 0; j < matrix[0].length; j++) {
            boolean sorted = false;

            while(!sorted) {
                sorted = true;

                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;

                        sorted = false;
                    }
                }
            }
        }

        for (int[] array: matrix) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
