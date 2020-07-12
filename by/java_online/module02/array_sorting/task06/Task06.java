/*
 * Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется упорядочить его по возрастанию. Делается это
 * следующим образом: сравниваются два соседних элемента
 * ai и a(i+1) . Если ai <= a(i+1), то продвигаются на
 * один элемент вперед. Если ai > a(i+1), то производится
 * перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 *
 * Сравнивать и менять будем числа, стоящие через промежуток d
 * друг от друга.
 */

package by.java_online.module02.array_sorting.task06;

public class Task06 {
    public static void main(String[] args) {
        double[] array;
        int d;  // Длина промежутка для сравнения чисел

        array = new double[] {5.1, 3.6, 8.4, -8.1, 6.9, 9.7, -7.3, 1.1, 1.5};
        d = array.length / 2;

        while (d >= 1) {
            for (int i = d; i < array.length; i++) {
                double current;
                int j;

                current = array[i];
                j = i - d;

                while (j >= 0 && current < array[j]) {
                    array[j + d] = array[j];
                    j -= d;
                }

                array[j + d] = current;
            }
            d /= 2;
        }

        System.out.println("Sorted sequence:");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }
}
