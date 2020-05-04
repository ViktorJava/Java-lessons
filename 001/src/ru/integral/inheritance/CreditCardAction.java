package ru.integral.inheritance;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.05.2020
 */
public class CreditCardAction extends CardAction {
    //поля, конструкторы, методы
    public boolean checkCreditLimit() {
        return true;
    }

    @Override //это говорит о том, чтополиморфная природа метода
    public void doPayment(double amountPayment) {
        //можно вызвать конструктор суперкласса
        //super.doPayment(amountPayment);
        System.out.println("complete for credit card");
    }
}
