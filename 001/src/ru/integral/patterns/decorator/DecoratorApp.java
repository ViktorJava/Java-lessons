package ru.integral.patterns.decorator;

/**
 * В этом примере, реализован паттерн проектирования Декоратор.
 * Моделируется принтер, который может печатать слова и предложения,
 * в нашем случае: Идёт печать. Затем при помощи декоратора, расширяется функционал
 * принтера и он печатает кавычки, и левую, правую квадратные скобки.
 * В данном случае мы использовали абстрактный класс для базового декоратора
 * и применили отношение агрегация (в базовом декораторе храним ссылку на
 * вложенный объект-компонент т.е. на интерфейс)
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 10.01.2020
 */
public class DecoratorApp {
    public static void main(String[] args) {
        /**
         * создание объектов без создания инстанса.
         * Вызов полного комплекта декораторов.
         */
        new QuotesDecorator(new LBracketDecor(new RBracketDecor(new Printer("Идёт печать")))).print();
//        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Идёт печать"))));
//        printer.print();
    }
}

/**
 * Интерфейс.
 */
interface IPrinter {
    void print();
}

class Printer implements IPrinter {
    private String value;

    Printer(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}

/**
 * Базовый декоратор.
 * Используем отношение типа агрегация.
 */
abstract class Decorator implements IPrinter {
    IPrinter component; // агрегация- главный принцым Декоратора.

    Decorator(IPrinter component) {
        this.component = component;
    }
}

/**
 * Декоратор.
 */
class QuotesDecorator extends Decorator {
    QuotesDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}

/**
 * Декоратор.
 */
class LBracketDecor extends Decorator {
    LBracketDecor(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}

/**
 * Декоратор.
 */
class RBracketDecor extends Decorator {
    RBracketDecor(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print("]");
    }
}