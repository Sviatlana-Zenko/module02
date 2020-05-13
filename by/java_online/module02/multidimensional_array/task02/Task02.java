/*
 * Дана квадратная матрица.
 * Вывести на экран элементы, стоящие на диагонали.
 */

package by.java_online.module02.multidimensional_array.task02;

public class Task02 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 8, 7, 6},
                          {5, 4, 3, 2}};

        //Находим и печатаем элементы, стоящие на главной диагонали
        System.out.println("Main diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();

        //Находим и печатаем элементы, стоящие на побочной диагонали
        System.out.println("Anti-diagonal (counter-diagonal):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
