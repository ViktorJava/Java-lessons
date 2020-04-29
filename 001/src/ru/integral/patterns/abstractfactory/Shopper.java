package ru.integral.patterns.abstractfactory;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.02.2020
 */
public class Shopper {
    public static void main(String[] args) {
        CarsFactory factory = new ToyotaFactory();
        factory.createSedan();
        factory.createJeep();
        factory.createCoupe();


    }
}
