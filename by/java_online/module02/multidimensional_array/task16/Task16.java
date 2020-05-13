/*
 * Магическим квадратом порядка n называется квадратная матрица
 * размера nxn, составленная из чисел 1, 2, 3, ..., n так,
 * что суммы по каждому столбцу, каждой строке и каждой
 * из двух больших диагоналей равны между собой.
 * Построить такой квадрат.
 * Пример магического квадрата порядка 3:
 * 6  1  8
 * 7  5  3
 * 2  9  4
 */

package by.java_online.module02.multidimensional_array.task16;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;

        n = enterSize("Enter a magic square size:");

        while (n < 3) {
            System.out.println("Magic square of this size doesn't exist. Try again.");
            n = enterSize("Enter a magic square size:");
        }

        int[][] matrix = new int[n][n];

        // Строим магический квадрат
        if (n % 2 != 0) {
            buildOddMagicSquare(matrix, n);
        } else if (n % 2 ==0) {
            if (n % 4 == 0) {
                buildDoublyEvenMagicSquare(matrix, n);
            } else {
                buildSinglyEvenMagicSquare(matrix, n);
            }
        }

        // Выводим магический квадрат
        printMagicSquare(matrix, n);
    }

    private static void buildOddMagicSquare(int[][] matrix, int n) {

        /*
         * Строить нечетный квадрат всегда начинаем с
         * центральной ячейки верхней строки.
         */

        int element = 1;
        int i = 0;
        int j = n / 2;
        int numberOfElements = n * n;

        while (numberOfElements > 0) {
            matrix[i][j] = element;

            /*
             * Следующие числа записываем в ячейки по правилу:
             * одна строка - вверх, один столбец - вправо.
             */

            i--;
            j++;

            /*
             * Если вылезаем за верхний предел квадрата, то следующую цифру
             * будем записывать в самой нижней ячейке соответствующего столбца.
             * Если вылезаем за правый предел квадрата, то следующую цифру
             * будем записывать в самой дальней (левой) ячейке соответствующей
             * строки. Если попали на ячейку, которая занята другой цифрой,
             * цифру записываем непосредственно под предыдущей записанной цифрой.
             * Если вылезаем за верхний и за правый предел, то цифру снова
             * записываем непосредственно под предыдущей записанной цифрой.
             */

            if (i < 0 & j < n) {
                i = n - 1;
            } else if (i >= 0 & j >= n) {
                j = 0;
            } else if (i < 0 & j >= n) {
                i += 2;
                j--;
            } else if (matrix[i][j] > 0) {
                i += 2;
                j--;
            }

            element++;
            numberOfElements--;
        }
    }

    private static void buildSinglyEvenMagicSquare (int[][] matrix, int n) {

        /*
         * Разделяем магический квадрат на четыре квадранта одинакового
         * размера. Квадрант А (сверху слева), C (сверху справа),
         * D (снизу слева) и B (снизу справа).
         */

        int element = 1;
        int numberOfElements = n * n;
        int firstNumber = 0;
        int lastNumber = firstNumber + numberOfElements / 4;

        int a = 0;
        int b = n / 2;

        int i = 0;
        int j = n / 4;

        // В каждый из квадрантов будем записывать четвертую часть всех чисел.
        int counter = 1;

        while (counter <= 4) {
            int x = lastNumber;
            int y = firstNumber;

            /*
             * Числа в каждый квадрант будем записывать по правилу
             * построения нечетного магического квадрата.
             */

            while (x > y) {
                matrix[i][j] = element;

                if (element < lastNumber) {
                    i--;
                    j++;

                    if (i < a & j < b) {
                        i += n / 2;
                    } else if (i >= a & j >= b) {
                        j -= n / 2;
                    } else if (i < a & j >= b) {
                        i += 2;
                        j--;
                    } else if (matrix[i][j] > 0) {
                        i += 2;
                        j--;
                    }
                }

                element++;
                x--;
            }

            /*
             * После заполнения одного квадранта переходим
             * к заполнению следующего.
             */

            firstNumber += numberOfElements / 4;
            lastNumber += numberOfElements / 4;

            if (counter == 1) {
                i++;
                j += n / 2;
                a = n / 2;
                b = n;
            } else if (counter == 2) {
                i -= n - 1;
                a -= n / 2;
            } else if (counter == 3) {
                i ++;
                j -= n / 2;
                a = n / 2;
                b -= n / 2;
            }

            counter++;
        }

        /*
         * После того, как все квадранты заполнены,
         * мы переставляем отдельные числа между собой отдельные
         * числа из квадранта A в D и из С в B  и наоборот.
         */

        for (int k = 0; k < matrix.length / 2; k++) {
            for (int l = 0; l < matrix[0].length; l++) {

                if (k <= n / 2 - 1) {
                    if (k == n / 4 & (l > 0 & l <= n / 4)) {
                        swapElements(matrix, n, k, l);
                    } else if (k != n / 4 & l < n /4) {
                        swapElements(matrix, n, k, l);
                    }

                    if (n / 4 - 1 > 0) {
                        if (l >= n - (n / 4 - 1)) {
                            swapElements(matrix, n, k, l);
                        }
                    }
                }
            }
        }
    }

    private static void swapElements(int[][] matrix, int n, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i + n / 2][j];
        matrix[i + n / 2][j] = temp;
    }

    private static void buildDoublyEvenMagicSquare(int[][] matrix, int n) {

        /*
         * В каждом углу магического квадрата выделяем промежуточный квадрат
         * размером n/4. В центре магического квадрата выделяем еще 1
         * промежуточный квадрат размером n/2. Всего получаем 5 промежуточных
         * квадратов. Начинаем строить магический квадрат (слева направо),
         * но числа будем записывайте только в ячейки, расположенные в
         * промежуточных квадратах, остальные ячейки будем пропускать
         * и они останутся нулевыми.
         */

        int element = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i < n / 4) | (i >= n - n / 4)) {
                    if ((j < n / 4) | (j >= n - n / 4)) {
                        matrix[i][j] = element;
                    }
                } else {
                    if ((j >= n / 4) & (j < n - n / 4)) {
                        matrix[i][j] = element;
                    }
                }
                element++;
            }
        }

        /*
         * Затем заполняем ячейки с нулями. Начинаем заполнение из
         * правого нижнего угла. Если ячейка уже заполнена другим
         * числом, то ее мы пропускаем.
         */

        element = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = element;
                }
                element++;
            }
        }
    }

    private static void printMagicSquare(int[][] matrix, int n) {
        // Находим самый большой элемент
        int biggestElement = n * n;

        // Считаем в количество цифр в нем
        int counter = 1;

        while (biggestElement / 10 > 0) {
            counter += 1;
            biggestElement /= 10;
        }

        String format = "%" + (counter + 1) + "d";
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[0].length; l++) {
                System.out.printf(format, matrix[k][l]);
            }
            System.out.println();
        }
    }

    public static int enterSize(String message) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println(message);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input. Try again.");
        }
        size = input.nextInt();

        return size;
    }
}


/*
 *  17  24   1   8  15  67  74  51  58  65       92  99   1   8  15  67  74  51  58  40
 *  23   5   7  14  16  73  55  57  64  66       98  80   7  14  16  73  55  57  64  41
 *   4   6  13  20  22  54  56  63  70  72        4  81  88  20  22  54  56  63  70  47
 *  10  12  19  21   3  60  62  69  71  53       85  87  19  21   3  60  62  69  71  28
 *  11  18  25   2   9  61  68  75  52  59  -->  86  93  25   2   9  61  68  75  52  34
 *  92  99  76  83  90  42  49  26  33  40       17  24  76  83  90  42  49  26  33  65
 *  98  80  82  89  91  48  30  32  39  41       23   5  82  89  91  48  30  32  39  66
 *  79  81  88  95  97  29  31  38  45  47       79   6  13  95  97  29  31  38  45  72
 *  85  87  94  96  78  35  37  44  46  28       10  12  94  96  78  35  37  44  46  53
 *  86  93 100  77  84  36  43  50  27  34       11  18 100  77  84  36  43  50  27  59
 */