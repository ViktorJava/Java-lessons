package ru.integral.javarush.polimorph2;

/**
 * Класс кота реализующий интерфейс животных.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.05.2020
 */
public class Cat implements Animal {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void speak() {
        System.out.println(toString() + " говорю МЯУ.");

    }

    @Override
    public String toString() {
        return "Я " + color + ", наглый кот " + name;
    }
}
