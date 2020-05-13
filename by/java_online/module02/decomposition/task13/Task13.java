/*
 * Два простых числа называются «близнецами», если они отличаются
 * друг от друга на 2 (например, 41 и 43). Найти и напечатать все пары
 * «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */

package by.java_online.module02.decomposition.task13;

public class Task13 {
    public static void main(String[] args) {
        int n = 17;

        System.out.println("Prime pairs in the range from " + n +
                           " to " + (n * 2) + ":");

        getPrimePair(createArray(n));
    }

    private static void getPrimePair(int[] array) {
        for (int j = 0; j < array.length - 2; j++) {
            System.out.println("(" + array[j] + ", " + array[j+2] + ")");
        }
    }

    private static int[] createArray(int number) {
        int lastNumber;
        int[] array;

        lastNumber = number * 2;
        array = new int[lastNumber - number + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number ++;
        }

        return array;
    }
}
