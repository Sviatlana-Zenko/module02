/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

package by.java_online.module02.one_dimensional_array.task02;

public class Task02 {
    public static void main(String[] args) {
        double[] array = new double[] {1.5, 3.8, 4.5, 5.6, 6.1, 7.4, 8.4, 9.6};
        double z = 5.55;
        int counter = 0;

        System.out.println("New sequence:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter += 1;
            }

            System.out.print(array[i] + " ");
        }

        System.out.print("\nNumber of replacements - " + counter);
    }
}
