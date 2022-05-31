package com.company;

public class UserBank {
    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo("122", "123", -34.5);
        } catch (AccountException email) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя"
                    + " и получателя совпадают");
        } catch (MoneyValueExeption sum) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. "
                    + "Сумма не должна превышать лимит в 100 000");
        }
    }
}
