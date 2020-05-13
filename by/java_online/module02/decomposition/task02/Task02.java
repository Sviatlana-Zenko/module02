/*
 * Написать метод(методы) для нахождения наибольшего общего
 * делителя четырех натуральных чисел.
 */

package by.java_online.module02.decomposition.task02;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[] {36, 18, 333, 36};;
        int gcd = array[0];  // greatest common divisor - НОД

        for (int i = 1; i < array.length; i++) {
            gcd = getDivisorForTwoNumbers(array[i], gcd);
        }

        System.out.println("We have 4 numbers:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nThe greatest common divisor is " + gcd + "." );
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

