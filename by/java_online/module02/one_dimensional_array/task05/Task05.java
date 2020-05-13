/*
 * Даны целые числа а1 ,а2 ,..., аn .
 * Вывести на печать только те числа, для которых аi > i.
 */

package by.java_online.module02.one_dimensional_array.task05;

public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 0, 8, -6, 4, 5, 9, 11, 10};

        System.out.println("New sequence:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array [i] + " ");
            }
        }
    }
}
