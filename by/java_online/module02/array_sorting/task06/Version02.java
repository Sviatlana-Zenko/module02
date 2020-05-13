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

public class Version02 {
    public static void main(String[] args) {
        double[] array = {5.1, 3.6, 8.4, 8.1, 6.9, 9.7, -7.3, 1.1, 1.5};
        int d = array.length / 2;  // Длина промежутка для сравнения чисел

        while (d >= 1) {
            int i = 0;

            while (i < array.length - d) {
                if (array[i] > array[i + d]) {
                    double temp = array[i];
                    array[i] = array[i + d];
                    array[i + d] = temp;

                    if (i > 0) {
                        i--;
                    } else {
                        i++;
                    }

                } else {
                    i++;
                }
            }

            d = d/2;
        }

        System.out.println("Sorted sequence:");
        for (double element : array) {
            System.out.print(element + " ");
        }
    }
}
