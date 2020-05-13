/*
 * Даны натуральные числа К и N. Написать метод (методы)
 * формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 */

package by.java_online.module02.decomposition.task12;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        int k = 9;
        int n = 50;
        int[] array = new int[10];

        fillArrayWithNumbers(k, n, array);

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    private static void fillArrayWithNumbers(int k, int n, int[] array) {
        Random number = new Random();

        for (int i = 0; i < array.length; i++) {
            int element = number.nextInt(n + 1);

            while (calculateSum(element) != k) {
                element = number.nextInt(n);
            }
            array[i] = element;
        }
    }

    private static int calculateSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit;
            digit = number % 10;

            sum += digit;
            number = (number - digit) / 10;
        }

        return sum;
    }
}
