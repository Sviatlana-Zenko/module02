/*
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

package by.java_online.module02.one_dimensional_array.task04;

public class Task04 {
    public static void main(String[] args) {
        double[] array;
        int indexMax;
        int indexMin;
        double max;
        double min;

        array = new double[] {0.21, 0.22, 0.92, 10.8, 11.99, 0.51};
        indexMax = 0;
        indexMin = 0;

        // Находим индексы максимального и минимального элементов массива
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }

        // Находим сами значения (максимальное и минимальное)
        max = array[indexMax];
        min = array[indexMin];

        // Заменяем элементы и выводим массив
        System.out.println("New sequence:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                array[j] = max;
            } else if (array[j] == max) {
                array[j] = min;
            }
            System.out.print(array [j] + " ");
        }
    }
}
