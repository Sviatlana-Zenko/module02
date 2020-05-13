/*
 * Написать метод(методы), определяющий, в каком из
 * данных двух чисел больше цифр.
 */

package by.java_online.module02.decomposition.task11;

public class Task11 {
    public static void main(String[] args) {
        int number1 = 487;
        int number2 = 68;

        int numberOFDigits1;
        int numberOFDigits2;

        numberOFDigits1 = calculateNumberOfDigits(number1);
        numberOFDigits2 = calculateNumberOfDigits(number2);

        if (numberOFDigits1 > numberOFDigits2) {
            System.out.println("The first number has more digits.");
        } else if (numberOFDigits2 > numberOFDigits1) {
            System.out.println("The second number has more digits.");
        } else {
            System.out.println("Both numbers have the same number of digits.");
        }
    }

    private static int calculateNumberOfDigits(int number) {
        int counter = 0;

        while (number > 0) {
            counter++;
            number /= 10;
        }

        return counter;
    }
}
