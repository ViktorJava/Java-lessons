package ru.integral.javarush.polimorph2;

/**
 * Класс собаки, реализующий интерфейс животных.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.05.2020
 */
public class Dog implements Animal {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println(toString() + " Я говорю ГАВ.");
    }

    @Override
    public String toString() {
        return "Я псина " + name + ", мне " + age + " лет.";
    }
}
