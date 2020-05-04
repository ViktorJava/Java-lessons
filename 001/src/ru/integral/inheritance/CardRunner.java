package ru.integral.inheritance;

/**
 * Демонстрация работы полиморфизма.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.05.2020
 */
public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction(); //восходящее преобразование к базовому типу.
        CreditCardAction cc = new CreditCardAction();//восходящее преобразование к базовому типу.
        //CreditCardAction cc = new CardAction(); //ошибка компиляции. Родитель нифига не знает о методах потомка.
        dc1.doPayment(12.55);//метод класса CardAction.
        dc2.doPayment(22.67);//полиморфный метод класса CreditCardAction.
        cc.doPayment(19.2);//полиморфный метод класса CreditCardAction.
        cc.checkCreditLimit();//неполиморфный метод класса CreditCardAction.
    }
}
