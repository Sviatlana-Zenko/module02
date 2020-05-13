/*
 * Сортировка обменами. Дана последовательность чисел
 * a1 <= a2 <= ... <= an. Требуется переставить числа в порядке
 * возрастания. Для этого сравниваются два соседних числа a1 +a(i+1).
 * Если ai > a(i+1), то делается перестановка. Так продолжается
 * до тех пор, пока все элементы не станут расположены в порядке
 * возрастания. Составить алгоритм сортировки, подсчитывая при
 * этом количества перестановок.
 */

package by.java_online.module02.array_sorting.task04;

public class Task04 {
    public static void main(String[] args) {
        int[] array = {8, 0, 3, 10, -11, 6, -55, 12};
        int counter = 0;
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    counter++;
                    isSorted = false;
                }
            }
        }

        System.out.println("Number of replacements is " + counter + ".");

        System.out.println("New sequence:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


