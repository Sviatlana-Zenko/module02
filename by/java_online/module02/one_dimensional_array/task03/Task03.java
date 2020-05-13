/*
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных
 * и нулевых элементов.
 */

package by.java_online.module02.one_dimensional_array.task03;

public class Task03 {
    public static void main(String[] args) {
        double[] array = new double[] {-4.5, -3.1, 0, -1.9, 0, 1.3, 2.3, 3.7};
        int negativeElement = 0;
        int positiveElement = 0;
        int zeroElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeElement += 1;
            } else if (array[i] > 0) {
                positiveElement += 1;
            } else {
                zeroElement += 1;
            }
        }

        System.out.print("Number of negative elements - " + negativeElement +
                         "\nNumber of positive elements - " + positiveElement +
                         "\nNumber of zero elements - " + zeroElement);
    }
}
