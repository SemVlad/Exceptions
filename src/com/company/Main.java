package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayExceptionTest arr0 = new ArrayExceptionTest();
        int[] array = new int[]{1, 2, 3, 4, 5};

        System.out.println("Правильный диапазон");
        arr0.printArray(array, 2, 4);
        System.out.println(" ");

        System.out.println("Не правильный диапазон");
        ArrayExceptionTest arr1 = new ArrayExceptionTest();
        arr1.printArray(array, 3, 7);
    }
}
