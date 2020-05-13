/*
 * Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */

package by.java_online.module02.decomposition.task17;

public class Task17 {
    public static void main(String[] args) {
        int number;
        int numberOfOperations;

        number = 198;

        numberOfOperations = calculateNumberOfOperations(number);

        System.out.println("We have number " + number + ". We need to do " +
                            numberOfOperations + " operations to get 0.");
    }

    private static int calculateSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit;
            digit = number % 10;

            sum += digit;
            number = (number - digit) / 10;
        }

        return sum;
    }

    private static int calculateNumberOfOperations(int number) {
        int counter = 0;

        while (number > 0) {
            number -= calculateSum(number);
            counter++;
        }

        return counter;
    }
}
