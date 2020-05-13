/*
 * Сортировка выбором. Дана последовательность чисел. Требуется
 * переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

package by.java_online.module02.array_sorting.task03;

public class Task03 {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 1, 2, 9, 3, 6, 8, 9, 9};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }

        System.out.println("New sequence:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
