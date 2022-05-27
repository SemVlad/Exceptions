package com.company;

public class ArrayExceptionTest {

    public static void printArray(int[] array, int start, int end) {

        for (; start < end; start++) {
            try {
                System.out.println(array[start]);
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = "
                        + start + " размер массива = " + array.length);
            }
        }
    }
}
