/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 */

package by.java_online.module02.multidimensional_array.task11;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random element = new Random();
        int[][] matrix = new int[10][20];
        int counter = 0;
        boolean condition = false; // Предполагаем, что подходящих строк нет

        // Заполняем матрицу случайными числами и выводим ee
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = element.nextInt(16);  // [0, 15] включительно
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Считаем количество 5 в строке, печатаем номера подходящих строк
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    counter += 1;
                }
            }

            if (counter >= 3) {
                System.out.println("The row number " + (i + 1) +
                                   " contains \"5\" " + counter + " times");

                condition = true;
            }
            counter = 0;
        }

        if (!condition) {
            System.out.println("The matrix doesn't have such rows");
        }
    }
}
