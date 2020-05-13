/*
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

package by.java_online.module02.one_dimensional_array.task06;

public class Task06 {
    public static void main(String[] args) {
        double[] array = new double[] {0.22, 1.44, 0.92, 10.8, 11.99, 0.51};
        double sum = 0;

        /*
         * В качестве порядкового номера принимаем индекс элемента.
         * Начинаем итерировать с индекса 2, т.к. простое
         * число — это число, которое больше единицы, имеющее ровно
         * два натуральных делителя: 1 и само себя.
         */

        for (int i = 2; i < array.length; i++) {
            int counter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter += 1;
                }
            }

            if (counter == 2) {
                sum += array[i];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
