/*
 * Даны дроби p1/q1, p2/q2, ... , pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

package by.java_online.module02.array_sorting.task08;

public class Task08 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 2, 3, 8};  // Массив из числителей дробей
        int[] array2 = {3, 9, 7, 5, 5};  // Массив из знаменателей дробей

        int maxDenominator;
        int denominator;

        // Находим наибольший из знамменателей
        maxDenominator = array2[0];

        for (int i = 1; i <array2.length; i++) {
            if (array2[i] > maxDenominator) {
                maxDenominator = array2[i];
            }
        }

        // Находим наименьший общий знаменатель
        denominator = maxDenominator;

        int j = 0;
        while (j < array2.length) {
            if (denominator % array2[j] != 0) {
                denominator += maxDenominator;
                j = 0;
            } else {
                j++;
            }
        }

        // Пересчитываем числители
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = denominator / array2[i] * temp;
        }

        // Сортируем числители по возрастанию
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    int temp = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp;

                    isSorted = false;
                }
            }
        }

        for (int element : array1) {
            System.out.print(element + "/" + denominator + " ");
        }
    }
}
