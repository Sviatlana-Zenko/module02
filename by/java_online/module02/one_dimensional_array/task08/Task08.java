/*
 * Дана последовательность целых чисел a1,a2,...,an.
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1,a2,...,an).
 */

package by.java_online.module02.one_dimensional_array.task08;

public class Task08 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 8, 2, 1, 3, 6, 8, 1};
        int min = array[0];

        //находим минимальный элемент в массиве
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        //считаем, сколько всего таких элементов в массиве
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                counter += 1;
            }
        }

        //создаем новый массив и переносим в него подходящие элементы
        int[] newArray = new int[array.length - counter];

        System.out.println("New sequence:");
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == min) {
                continue;
            }
            else {
                newArray[j] = array[i];
                System.out.print(newArray[j] + " ");
                j++;
            }
        }
    }
}
