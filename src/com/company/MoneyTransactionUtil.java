package com.company;

public class MoneyTransactionUtil {

    //конструктор
    private MoneyTransactionUtil() {
    }

    public static void sendTo(String numCardFrom, String numCardTo, double sum) throws RuntimeException {

        try {
            if (numCardFrom == numCardTo) {
                System.out.println("Проверка номера карт");
                throw new RuntimeException("Одинаковый номер карт");
            }

            if (sum <= 0 || sum > 100_000.00) {
                System.out.println("Номер - гут");
                System.out.println("Проверка суммы перевода");
                throw new RuntimeException("попахивает муткой)");
            }
        } finally {

        }
        System.out.println("Сумма = " + sum + " со счета - " + numCardFrom
                + " успешно переведена на счет - " + numCardTo);
    }
}



