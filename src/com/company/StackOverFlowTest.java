package com.company;

public class StackOverFlowTest {

    public static void main(String[] args) {

        try {
            test(0);
        } catch (StackOverflowError e) {
            System.out.println("Ошибка переполнения стека");
        }
    }

    public static void test(int count) {
        count++;
        System.out.println(count);
        test(count);
    }
}