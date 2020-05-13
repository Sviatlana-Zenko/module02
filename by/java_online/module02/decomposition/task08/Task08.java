/*
 * Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех
 * последовательно расположенных элементов массива с номерами от k до m.
 */

package by.java_online.module02.decomposition.task08;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int k;
        int m;

        k = enterVariable("Enter k:");
        m = enterVariable("Enter m:");

        getElementSequence(k, m, array);
    }

    private static void getElementSequence(int k, int m, int[] array) {
        if (!checkInput(k, m, array)) {
            System.out.println("Wrong numbers (k < 0 or m > " + array.length +
                                " or [k, m] < 3)");

            return;
        } else {
            System.out.println("Sequences of elements");
            for (int i = k; i <= m - 2; i++) {
                System.out.println(array[i] + "+" + array[i + 1] + "+" +
                                   array[i + 2] + "=" + calculateSum(array, i));
            }
        }
    }

    private static boolean checkInput (int k, int m, int[] array) {
        boolean isCorrect = true;

        if (((m + 1) - k < 3) | k < 0 | m > array.length - 1){
            isCorrect = false;
        }

        return isCorrect;
    }

    private static int calculateSum (int[] array, int i) {
        int sum;
        sum = array[i] + array[i + 1] + array[i + 2];

        return sum;
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
