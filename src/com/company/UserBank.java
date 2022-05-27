package com.company;

public class UserBank {
    public static void main(String[] args) {

        try {

            MoneyTransactionUtil.sendTo("122", "123", 34.5);

        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }
    }
}
