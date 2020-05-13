/*
 * Натуральное число, в записи которого n цифр,
 * называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

package by.java_online.module02.decomposition.task14;

public class Task14 {
    public static void main(String[] args) {
        int lastNumber = 100000;

        System.out.println("Armstrong numbers (from 1 to " + lastNumber + "):");

        getArmstrongNumber(lastNumber);
    }

    private static void getArmstrongNumber(int lastNumber) {
        int number = 1;

        while (number <= lastNumber) {
            if (calculateSum(number) == number) {
                System.out.print(number + "; ");
            }
            number++;
        }
    }

    private static int calculateSum(int number) {
        int sum = 0;
        int power = calculateNumberOfDigits(number);

        while (number > 0) {
            int digit;
            digit = number % 10;

            sum = (int) (sum + Math.pow(digit, power));
            number = (number - digit) / 10;
        }

        return sum;
    }

    private static int calculateNumberOfDigits(int number) {
        int counter = 1;

        while (number / 10 > 0) {
            counter += 1;
            number = number / 10;
        }
        return counter;
    }
}

