/*
 * Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *  1   2    3  ... n
 *  n  n-1  n-2 ... 1
 *  1   2    3  ... n
 *  n  n-1  n-2 ... 1
 *  .................
 *  n  n-1  n-2 ... 1
 */

package by.java_online.module02.multidimensional_array.task04;

public class Task04 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];

        int min = 1;  //мин. значение, которое может принимать элемент мартицы
        int max = n;  //макс. значение, которое может принимать элемент мартицы

        // Построчно заполняем матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i % 2 == 0){
                    matrix[i][j] = min;
                    min++;
                } else {
                    matrix[i][j] = max;
                    max--;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
            min = 1;
            max = n;
        }
    }
}
