/*
 * На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание. Координаты точек занести в массив.
 */

package by.java_online.module02.decomposition.task04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Task04 {
    public static void main(String[] args) {
        double[][] array = {{-5.0, 14.0},
                            {3.0, 5.0},
                            {4.0, 8.0},
                            {-1.0, -2.0}};

        getMaxDistance(array);
    }

    private static void getMaxDistance(double[][] array) {
        double maxDistance = 0;
        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;

            while (j < array.length) {
                double distance;
                distance = calculateDistance(array, i, j);

                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = i + 1;
                    point2 = j + 1;
                }
                j++;
            }
        }

        System.out.println("Maximum distance (" + maxDistance + ") between point " +
                            point1 + " and point " + point2);
    }

    private static double calculateDistance(double[][] array, int i, int j) {
        double distance;

        distance = Math.sqrt(Math.pow((array[j][0] - array[i][0]), 2) +
                   Math.pow((array[j][1] - array[i][1]), 2));

        return distance;
    }
}


