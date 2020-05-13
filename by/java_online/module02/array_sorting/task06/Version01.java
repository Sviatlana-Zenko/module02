/*
 * Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется упорядочить его по возрастанию. Делается это
 * следующим образом: сравниваются два соседних элемента
 * ai и a(i+1) . Если ai <= a(i+1), то продвигаются на
 * один элемент вперед. Если ai > a(i+1), то производится
 * перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

package by.java_online.module02.array_sorting.task06;

public class Version01 {
    public static void main(String[] args) {
        double[] array = {5.1, 3.6, 8.4, 8.1, 6.9, 9.7, -7.3, 1.1, 1.5};
        int i = 0;

        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if (i > 0) {
                    i--;
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }

        System.out.println("Sorted sequence:");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }
}
