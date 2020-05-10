package ru.integral.javarush.polimorph;

/**
 * Пример полиморфизма через extends.
 * Имеется базовый суперкласс Dancer и два класса-потомка: ElectroDancer и BreakDancer c отношениями is-a.
 * Массив типа суперкласса, содержит объекты всех наших классов (происходит восходящнее приведение типов).
 * В цикле foreach вызывается полиморфный метод dancer.
 * В данном случае мы имеем дело с переопределением метода dancer,
 * а это именно то, что создает многообразие форм (поведений).
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @see "https://javarush.ru/groups/posts/polimorfizm-v-java"
 * @since 05.05.2020
 */
public class Main {

    public static void main(String[] args) {
        Dancer[] discotheque = {
                new Dancer("Витёк", 40),
                new ElectroDancer("Жэка", 22),
                new BreakDancer("Миха", 38)
        };
        for (Dancer d : discotheque) {
            d.dancer();
        }
    }
}
