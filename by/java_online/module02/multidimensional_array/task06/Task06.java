/*
 *  Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *  1  1  1 ... 1  1  1
 *  0  1  1 ... 1  1  0
 *  0  0  1 ... 1  0  0
 *  ...................
 *  0  1  1 ... 1  1  0
 *  1  1  1 ... 1  1  1
 */

package by.java_online.module02.multidimensional_array.task06;

public class Task06 {
    public static void main(String[] args) {
        int n = 8;
        int[][] matrix = new int[n][n];
        int min = 1;
        int x = n;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i <= n / 2 - 1 && (j < x && j >= y)) |
                    (i > n / 2 - 1 && (j >= x - 1 && j < y + 1))){

                    matrix[i][j] = min;
                } else {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
            x--;
            y++;
        }
    }
}
