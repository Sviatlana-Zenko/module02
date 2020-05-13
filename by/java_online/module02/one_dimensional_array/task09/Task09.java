/*
 * В массиве целых чисел с количеством элементов n найти наиболее
 * часто встречающееся число. Если таких чисел несколько,
 * то определить наименьшее из них.
 */

package by.java_online.module02.one_dimensional_array.task09;

public class Task09 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 8, 3, 2, 5, 3, 12, 11, 3, 11, 11, 21, 11};

        int i;
        int j;
        int counter;
        int counterMax;
        int element;

        i = 0;

        //сортируем массив
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                int temporaryValue = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temporaryValue;

                if (i > 0) {
                    i--;
                } else {
                    i++;
                }
            }
        }

        /*
         * Считаем, сколько раз повторяется каждое число. Изначально
         * предполагаем, что число стоящее первым в массиве (после
         * сортировки - это минимальное число), повторяется наибольшее
         * число раз.
         */

        j = 0;
        counter = 1;
        counterMax = 1;
        element = array[0];

        while (j + 1 < array.length) {
            if (array[j] == array[j + 1]) {
                counter += 1;
                if (counter > counterMax) {
                    counterMax = counter;
                    element = array[j];
                }
            } else {
                counter = 1;
            }
            j++;
        }

        System.out.println("The most common number is " + element);
    }
}
