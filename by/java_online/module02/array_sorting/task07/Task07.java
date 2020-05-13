/*
 * Пусть даны две неубывающие последовательности действительных
 * чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется
 * указать те места, на которые нужно вставлять элементы
 * последовательности b1 <= b2 <= ... <= bm в первую последовательность
 * так, чтобы новая последовательность оставалась возрастающей.
 */

package by.java_online.module02.array_sorting.task07;

public class Task07 {
    public static void main(String[] args) {
        int[] array1 = {-23, -20, -15, -4, 1, 6, 9, 10, 12, 21};
        int[] array2 = {-25, -17, 6, 7, 11, 20, 30};
        int j = 0;

        while (j < array2.length) {
            int index = 0;

            if (array2[j] <= array1[array1.length - 1]) {

                for (int i = 0; i < array1.length; i++) {
                    if (array2[j] <= array1[i]) {
                        index = j + i;
                        break;
                    }
                }

            } else {
                index = array1.length + j;
            }

            System.out.println("Index for " + array2[j] + " is " + index);
            j++;
        }
    }
}
