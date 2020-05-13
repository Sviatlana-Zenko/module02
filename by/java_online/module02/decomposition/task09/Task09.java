/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

package by.java_online.module02.decomposition.task09;

public class Task09 {
    public static void main(String[] args) {
        double x = 15.0;
        double y = 5.0;
        double t = 6.0;
        double z = 14.0;

        calculateQuadrangleArea(x, y, t, z);
    }

    private static void calculateQuadrangleArea(double x, double y, double t, double z) {

        /*
         * Чтобы найти площадь четырехугольника разделим его на 2
         * треугольника (проведем диагональ), один из которых
         * 3прямоугольный, далее найдем площади каждого из них.
         */

        double quadrangleArea;
        quadrangleArea = calculateFirstArea(x, y) + calculateSecondArea(x, y, t, z);

        if (checkSides(x, y, t, z) == false) {
            System.out.println("A quadrangle does not exist.");
            return;
        } else {
            System.out.println("A quadrangle area is " + quadrangleArea);
        }
    }

    private static boolean checkSides(double x, double y, double t, double z) {

        /*
         * Для того, чтобы четырехугольник существовал, необходимо,
         * чтобы длина одной из его сторон была меньше, чем сумма
         * длин трех остальных сторон, иначе будет невозможно замкнуть
         * периметр. Для проверки возьмем наибольшую из сторон.
         */

        double[] array = new double[4];
        array[0] = x;
        array[1] = y;
        array[2] = t;
        array[3] = z;

        sortArray(array);

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += array[i];
        }

        boolean condition = true;
        if (array[3] >= sum) {
            condition = false;
        }

        return condition;
    }

    private static void sortArray(double[] array) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSorted = false;
                }
            }
        }
    }

    private static double calculateFirstArea(double x, double y) {
        double firstArea;
        firstArea = (x * y) / 2;

        return firstArea;
    }

    private static double calculateSecondArea(double x, double y, double t, double z) {
        double diagonal;
        double halfOfPerimeter;
        double secondArea;

        diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        halfOfPerimeter = (t + z + diagonal) / 2;
        secondArea = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - t) *
                     (halfOfPerimeter - z) * (halfOfPerimeter - diagonal));

        return secondArea;
    }
}

