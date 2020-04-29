package ru.integral.patterns.abstractfactory;

/**
 * Холдинг по производству автомобилей,
 * является абстрактной фабрикой.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.02.2020
 */
public interface CarsFactory {
    Sedan createSedan();

    Coupe createCoupe();

    Jeep createJeep();
}
