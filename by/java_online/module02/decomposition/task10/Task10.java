/*
 * Дано натуральное число N. Написать метод(методы) для
 * формирования массива, элементами которого являются цифры числа N.
 */

package by.java_online.module02.decomposition.task10;

public class Task10 {
    public static void main(String[] args) {
        int n = 245184;

        int arrayLength;
        int[] array;

        arrayLength = calculateArrayLength(n);
        array = new int[arrayLength];

        createArray(array, n);

        System.out.println("New array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int calculateArrayLength(int number) {
        int length = 1;

        while (number / 10 > 0) {
            length ++;
            number = number / 10;
        }

        return length;
    }

    private static void createArray(int[] array, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = (number - array[i]) / 10;
        }
    }
}
