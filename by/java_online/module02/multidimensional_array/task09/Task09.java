/*
 * Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

package by.java_online.module02.multidimensional_array.task09;

public class Task09 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 13, 4, 1, 5, 3},
                          {1, 6, 1, 5, 2, 9, 2}};

        int columnSum = 0;
        int maxSum = 0;
        int[] sumArray = new int[matrix[0].length];
        int i = 0;

        /*
         * Находим сумму в каждом столбце матрицы и записывает ее в
         * новый массив. Затем, сравнивая суммы, определяем
         * максимальную из них.
         */

        while (i < matrix[0].length) {
            for (int[] element : matrix) {
                columnSum += element[i];
            }

            sumArray[i] = columnSum;
            System.out.println("The sum of elements in column " +
                                (i + 1) + " is " + columnSum);

            if (columnSum >= maxSum){
                maxSum = columnSum;
            }
            i++;
            columnSum = 0;
        }

        //находим суммы равные максимальной и выводим номер этих столбцов
        System.out.print ("Column(s) with the greatest sum is(are) ");
        for (int j = 0; j < sumArray.length; j++){
            if (sumArray[j] == maxSum) {
                System.out.print((j + 1) + "; ");
            }
        }
    }
}
