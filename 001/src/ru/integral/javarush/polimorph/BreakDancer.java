package ru.integral.javarush.polimorph;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.05.2020
 */
public class BreakDancer extends Dancer {
    public BreakDancer(String name, int age) {
        super(name, age);
    }

    @Override//это говорит о том, что полиморфная природа метода.
    public void dancer() {
        System.out.println(toString() + " Я херячу брэйк на пузе ;-)");
    }
}
