/*
 * Даны действительные числа a(1),a(2),...,a(2n).
 * Найти max(a(1) + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1))
 */

package by.java_online.module02.one_dimensional_array.task07;

public class Task07 {
    public static void main(String[] args) {
        double[] array = new double[] {0.22, 1.44, 0.92, 10.8, 11.99, 0.51};
        double maxSum = 0;

        // Проверяем, чтобы был задан массив с четным количеством элементов
        if (array.length % 2 != 0) {
            System.out.println("Number of elements is odd.");
            return;
        }

        int j = array.length - 1;
        for (int i = 0; i < j; i++) {
            maxSum = Math.max(maxSum, array[i] + array[j]);
            j--;
        }

        System.out.println("max = " + maxSum);
    }
}
