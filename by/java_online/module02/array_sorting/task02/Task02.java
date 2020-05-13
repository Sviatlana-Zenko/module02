/*
 * Даны две неубывающие последовательности. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

package by.java_online.module02.array_sorting.task02;

public class Task02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {0, 0, 2, 2, 5};

        int newLength = array1.length + array2.length;
        int[] newArray = new int[newLength];

        // Объеденяем два массива в один
        for (int i = 0; i < newLength; i++) {
            if (i <= array1.length - 1) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[i - array1.length];
            }
        }

        // Сортируем массив по возрастанию
        for (int i = newLength - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (newArray[j] > newArray[j + 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        System.out.println("New sequence:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
