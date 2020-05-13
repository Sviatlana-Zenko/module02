/*
 * Сформировать квадратную матрицу порядка n
 * по заданному образцу(n - четное):
 *   1   1   1  ...  1   1   0
 *   2   2   2  ...  2   0   0
 *   3   3   3  ...  3   0   0
 *  ..........................
 *  n-1  0   0   0   0   0   0
 */

package by.java_online.module02.multidimensional_array.task05;

public class Task05 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];

        /*
         * Построчно заполняем матрицу.
         * Всем элементам, сумма индекса строки и индекса столбца которых
         * меньше числа 'n', мы присваиваем значение равное индексу строки + 1.
         * Остальные элементы (для них эта сумма больше числа 'n')
         * принимают значение равное 0.
         */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i + j < n) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
