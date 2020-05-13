/*
 * Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив, включив
 * второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */

package by.java_online.module02.array_sorting.task01;

public class Task01 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 6, 5, 6, 2, 8};
        int[] array2 = {9, 9, 9, 9, 9, 9};
        int k = 4;

        // Проверяем, чтобы число k + 1 не было больше длины первого массива
        if (k + 1 > array1.length) {
            System.out.println("'k' can't be bigger than " + (array1.length - 1));
            return;
        }

        /*
         * Если k соответствует заданным условиям, то создаем новый массив,
         * длина которого, равна сумме двух данных массивов.
         */

        int newLength = array1.length + array2.length;
        int[] newArray = new int[newLength];

        System.out.println("New sequence:");
        for (int i = 0; i < newLength; i++) {

            if (i <= k - 1) {
                newArray[i] = array1[i];
            } else if (i >= k + array2.length) {
                newArray[i] = array1[i - array2.length];
            } else {
                newArray[i] = array2[i - k];
            }

            System.out.print(newArray[i] + " ");
        }
    }
}
