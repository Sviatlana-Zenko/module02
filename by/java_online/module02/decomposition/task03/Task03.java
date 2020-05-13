/*
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 */

package by.java_online.module02.decomposition.task03;

public class Task03 {
    public static void main(String[] args) {
        double a;
        double triangleArea;
        double hexagonArea;

        /*
         * Правильный шестиугольник, состоит из 6 равносторонних
         * треугольников со стороной a. Площадь правильного шестиугольника
         * равна площади равностороннего треугольника умноженной на 6.
         */

        a = 10.5;
        triangleArea = getTriangleArea(a);
        hexagonArea = 6 * triangleArea;

        System.out.println("The hexagon area is " + hexagonArea);
    }

    private static double getTriangleArea(double triangleSide) {
        double area;

        area = (Math.sqrt(3) * Math.pow(triangleSide, 2)) / 4;

        return area;
    }
}
