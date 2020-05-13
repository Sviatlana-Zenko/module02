/*
 * Написать метод(методы) для вычисления суммы факториалов
 * всех нечетных чисел от 1 до 9.
 */

package by.java_online.module02.decomposition.task07;

public class Task07 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 9;

        System.out.println("Sum of factorials is " + calculateSum(n1, n2));
    }

    private static int calculateSum (int n1, int n2) {
        int sum = 0;

        while (n1 <= n2) {
            if (n1 % 2 != 0) {
                sum += calculateFactorial(n1);
            }
            n1++;
        }

        return sum;
    }

    private static int calculateFactorial (int n1) {
        int factorial = 1;

        for (int j = 1; j <= n1; j++) {
            factorial *= j;
        }

        return factorial;
    }
}
