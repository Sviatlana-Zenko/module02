/*
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 */

package by.java_online.module02.one_dimensional_array.task01;

public class Task01 {
    public static void main(String[] args) {
        int[] array;
        int k;
        int sum;

        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        k = 3;
        sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
