/*
 * Найти все натуральные n-значные числа, цифры в которых образуют
 * строго возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */

package by.java_online.module02.decomposition.task15;

public class Task15 {
    public static void main(String[] args) {
        int n;
        int firstNumber;
        int lastNumber;

        n = 6;

        firstNumber = (int) Math.pow(10, n - 1);
        lastNumber = (int) (Math.pow(10, n) - 1);

        System.out.println("Numbers in which digits are monotonically increasing:");

        getIncreasingSequence(firstNumber, lastNumber, n);
    }

    private static void getIncreasingSequence(int number, int lastNumber, int n) {
        while (number <= lastNumber) {
            if (checkNumber(createArray(number, n))) {
                System.out.print(number + "; ");
            }
            number++;
        }
    }

    private static boolean checkNumber(int[] array) {
        boolean isIncreasing = true;

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j + 1] - array[j] != 1) {
                isIncreasing = false;
                break;
            }
        }

        return isIncreasing;
    }

    private static int[] createArray(int number, int n) {
        int[] array = new int[n];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = (number - array[i]) / 10;
        }

        return array;
    }
}
