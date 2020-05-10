package ru.integral.javarush.polimorph;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 04.05.2020
 */
public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dancer() {
        System.out.println(toString() + " Я отплясываю как все");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет.";
    }
}
