/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package by.java_online.module02.multidimensional_array.task12;

public class Task12 {
    public static void main(String[] args) {
        int [][] matrix = {{4, 5, 8, 9, 25},
                           {6, 2, 1, 3, 17},
                           {3, 17, 2, 8, 7},
                           {4, 9, 1, 1, 9}};

        /*
         * Сортируем строки по возрастанию.
         * Для сортировки по убыванию -  в строке 21 должно быть
         * matrix[i][j] < matrix[i][j + 1]
         */

        for (int i = 0; i < matrix.length; i++) {
            boolean sorted = false;

            while(!sorted) {
                sorted = true;

                for (int j = 0; j < matrix[0].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;

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
