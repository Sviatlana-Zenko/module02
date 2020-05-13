/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 */

package by.java_online.module02.multidimensional_array.task14;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 7; //строки
        int n = 4; //столбцы

        /*
         * Количество строк не должно быть меньше, чем количество столбцов
         * (иначе мы не сможем разместить нужное нам количество единиц).
         */

        if (m < n) {
            System.out.println("The task cannot be solved (m < n)");
            return;
        }

        /*
         * Формируем временную обратную матрицу (меняем столбцы и строки).
         * Заполняем эту матрицу единицами и нулями.
         */

        int[][] tempMatrix = new int[n][m];
        Random element = new Random();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempMatrix[i][j] = element.nextInt(2);  // Заполняем строку
                counter += tempMatrix[i][j]; // Подсчитываем количество единиц в ней
            }

            /*
             * Проверяем, есть ли у нас нужное количество единиц.
             * Если есть, то заполняем следующую строку.
             * Если нет, то повторяем процесс рандомного заполнения.
             */

            if (counter == i + 1) {
                continue;
            } else {
                while (counter != i + 1) {
                    counter = 0;

                    for (int k = 0; k < m; k++) {
                        tempMatrix[i][k] = element.nextInt(2);
                        counter += tempMatrix[i][k];
                    }

                    if (counter == i + 1) {
                        continue;
                    }
                }
            }
            counter = 0;
        }

        // Формируем матрицу, необходиму по условию (меняем строки и столбцы)
        int[][] matrix = new int[m][n];
        int x1 = m - 1;

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                matrix[x][y] = tempMatrix[y][x1];
                System.out.print(matrix[x][y] + " ");
            }

            x1--;
            System.out.println();
        }

    }
}
