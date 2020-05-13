/*
 * Написать метод(методы), проверяющий,
 * являются ли данные три числа взаимно простыми.
 *
 * Целые числа взаимно просты, если их наибольший
 * общий делитель (НОД) равен 1
 */

package by.java_online.module02.decomposition.task06;

public class Task06 {
    public static void main(String[] args) {
        int[] array = {28, 16, 5};

        checkNumbers(array);
    }

    private static void checkNumbers(int[] array) {
        if (getCommonDivisor(array) == 1) {
            System.out.println("Numbers are relatively prime " +
                               "(the greatest common divisor is 1).");

        } else {
            System.out.println("Numbers are not relatively prime.");
        }
    }

    private static int getCommonDivisor(int[] array) {
        int gcd = array[0];  // greatest common divisor - НОД

        for (int i = 1; i < array.length; i++) {
            gcd = getDivisorForTwoNumbers(array[i], gcd);
        }

        return gcd;
    }

    private static int getDivisorForTwoNumbers(int number1, int number2) {
        int gcdTemporary;
        int x;

        x = number1 % number2;

        if (x == 0) {
            gcdTemporary = number2;
        } else {
            int y = number2 % x;
            gcdTemporary = x - y;
        }

        return gcdTemporary;
    }
}




