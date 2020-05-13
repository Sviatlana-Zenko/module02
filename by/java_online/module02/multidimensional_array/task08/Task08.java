/*
 * В числовой матрице поменять местами два любых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им
 * позиции другого, а элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры
 */

package by.java_online.module02.multidimensional_array.task08;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7, 9},
                          {2, 4, 6, 8, 1},
                          {9, 7, 5, 3, 1}};

        int x;
        int y;

        // Номера столбцов, которые мы хотим поменять местами
        x = enterVariable("Enter first column number:");
        y = enterVariable("Enter second column number:");

        // Проверка введенных значений
        if (x > matrix[0].length | y > matrix[0].length | x <= 0 | y <= 0) {
            System.out.println("You entered wrong numbers. They can't be:\n" +
                                "- negative,\n" +
                                "- equal to zero,\n" +
                                "- greater than " + matrix[0].length);

            return;
        }

        // Перемещаем элементы столбцов
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][x - 1];
            matrix[i][x - 1] = matrix[i][y - 1];
            matrix[i][y - 1] = temp;
        }

        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[j][k] + " ");
            }

            System.out.println();
        }
    }

    public static int enterVariable(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int variable;

        System.out.println(message);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        variable = input.nextInt();

        return variable;
    }
}
