package ru.integral.patterns.abstractfactory;

/**
 * Предприятие входящее в холдинг.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.02.2020
 */
public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

    @Override
    public Jeep createJeep() {
        return new ToyotaJeep();
    }

}
