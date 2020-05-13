/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А, В) = (А * В) / НОД(А, В)
 */

package by.java_online.module02.decomposition.task01;

public class Task01 {
    public static void main(String[] args) {
        int[] array;
        int leastCommonMultiple;  // НОК
        int greatestCommonDivisor;  // НОД

        array = new int[] {48, 14};
        leastCommonMultiple = getMultiple(array, getBiggestNumber(array));
        greatestCommonDivisor = getProduct(array) / leastCommonMultiple;

        System.out.println("We have two numbers:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nThe least common multiple is " + leastCommonMultiple + ".\n" +
                           "The greatest common divisor is " + greatestCommonDivisor + ".");
    }

    private static int getBiggestNumber(int[] array) {
        int biggestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }

        return biggestNumber;
    }

    private static int getMultiple(int[] array, int biggestNumber) {
        int multiple = biggestNumber;
        int j = 0;

        while (j < array.length) {
            if (multiple % array[j] == 0) {
                j++;
            } else {
                multiple += biggestNumber;
                j = 0;
            }
        }

        return multiple;
    }

    private static int getProduct(int[] array) {
        int product = 1;

        for (int k = 0; k < array.length; k++) {
            product *= array[k];
        }

        return product;
    }
}
