package ru.integral.patterns.abstractfactory;

/**
 * Предприятие входящее в холдинг.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.02.2020
 */
public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public Jeep createJeep() {
        return new FordJeep();
    }
}
