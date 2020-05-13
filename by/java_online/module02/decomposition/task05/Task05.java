/*
 * Составить программу, которая в массиве A[N] находит второе
 * по величине число (вывести на печать число, которое меньше
 * максимального элемента массива, но больше всех других элементов).
 */

package by.java_online.module02.decomposition.task05;

public class Task05 {
    public static void main(String[] args) {
        int[] array = {5, 14, 8, 8, 18, 14};

        sortArray(array);

        System.out.println("The second largest number is " +
                            getSecondLargestNumber(array));
    }

    private static int getSecondLargestNumber(int[] array) {
        int number = array[array.length - 1];

        for (int j = array.length - 2; j >= 0; j--) {
            if (array[j] < number) {
                number = array[j];
                break;
            }
        }

        return number;
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int indexMax = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < max) {
                    max = array[j];
                    indexMax = j;
                }
            }

            if (i != indexMax) {
                int temp = array[i];
                array[i] = array[indexMax];
                array[indexMax] = temp;
            }
        }
    }
}
