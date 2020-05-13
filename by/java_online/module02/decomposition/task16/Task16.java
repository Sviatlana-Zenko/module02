/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих
 * только нечетные цифры. Определить также, сколько четных цифр в
 * найденной сумме. Для решения задачи использовать декомпозицию.
 */

package by.java_online.module02.decomposition.task16;

public class Task16 {
    public static void main(String[] args) {
        int n;
        int firstNumber;
        int lastNumber;
        int sum;
        int numberOfEvenDigits;

        n = 2;

        firstNumber = (int) Math.pow(10, n - 1);
        lastNumber = (int) (Math.pow(10, n) - 1);
        sum = calculateSum(firstNumber, lastNumber);
        numberOfEvenDigits = getNumberOfEvenDigits(sum);

        System.out.println("We have numbers from " + firstNumber + " to " +
                           lastNumber + ". \nThe sum of numbers with odd " +
                           "digits is " + sum + ".");


        if (numberOfEvenDigits > 0) {
            System.out.println("This sum has " + numberOfEvenDigits + " even digits.");
        } else {
            System.out.println("This sum doesn't have even digits.");
        }
    }

    private static int calculateSum(int firstNumber, int lastNumber) {
        int sum = 0;
        int number = firstNumber;

        while (number <= lastNumber) {
            if (checkNumber(number)) {
                sum += number;
            }
            number++;
        }

        return sum;
    }

    private static boolean checkNumber(int number) {
        boolean isOdd = true;

        while (number > 0) {
            int digit;
            digit = number % 10;

            if (digit % 2 == 0) {
                isOdd = false;
                break;
            }
            number = (number - digit) / 10;
        }

        return isOdd;
    }

    private static int getNumberOfEvenDigits(int number) {
        int counter = 0;

        while (number > 0) {
            int digit;
            digit = number % 10;

            if (digit % 2 != 0) {
                counter++;
            }
            number = (number - digit) / 10;
        }

        return counter;
    }
}
