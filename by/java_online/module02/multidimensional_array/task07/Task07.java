/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2-J^2)/N)
 * и подсчитать количество положительных элементов в ней.
 */

package by.java_online.module02.multidimensional_array.task07;

public class Task07 {
    public static void main(String[] args) {
        int n = 4;
        double[][] matrix = new double[n][n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/n);
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j] > 0){
                    counter +=1;
                }
            }

            System.out.println();
        }

        System.out.println("Number of positive elements: " + counter);
    }
}
