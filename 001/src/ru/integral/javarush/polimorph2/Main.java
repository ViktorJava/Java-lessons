package ru.integral.javarush.polimorph2;

/**
 * Пример полиморфизма через implements.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.05.2020
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Шарик", 5),
                new Cat("Матроскин", "рыжый")
        };

        for (Animal a : animals) {
            a.speak();
        }
    }
}
