/*
 * Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

package by.java_online.module02.one_dimensional_array.task10;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        /*
         * Условно разделяем массив на две половины:
         * первая - это не "зануленные" элементы, вторая - "зануленные".
         * Определяем индекс, который делит массив на эти
         * два половины (в зависимости от того, четное количество
         * элементов в массиве или нечетное.
         */

        int middle;
        if (array.length % 2 == 0) {
            middle = array.length/2 - 1;
        } else {
            middle = array.length/2 ;
        }

        /*
         * Далее проходимся по всем элементам массива,
         * определяем, какие элементы нужно занулить, и разносим
         * элементы по разным половинам
         */

        System.out.println("New sequence:");
        for (int i = 0; i < array.length; i++) {

            if (i % 2 != 0 && i <= middle) {
                array[i] = array[2 * i];
            } else if (i % 2 != 0 && i > middle) {
                array[i] = 0;
            } else if (i % 2 == 0 && i <= middle) {
                array[i] = array[2 * i];
            } else if (i % 2 == 0 && i > middle) {
                array[i] = 0;
            }

            System.out.print(array[i] + " ");
        }
    }
}
