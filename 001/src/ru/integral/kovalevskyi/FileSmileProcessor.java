package ru.integral.kovalevskyi;

/**
 * Использование абстрактных классов и методов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.01.2020
 */
public class FileSmileProcessor extends AbstractSmileProcessor {
    //поля, методы, конструкторы.
    @Override
    // аннотация указывает на полиморфную природу метода
    // метод д.б. реализован в подклассе
    String readString() { // переопределённый метод
        return "text from :-) file :-) :-)"; // реализация
    }

    public static void main(String[] args) {
        // Создать объект от абстрактоного класса нельзя!
        // fileSmileProcessor = new AbstractSmileProcessor();// нельзя!
        // но можно объявить ссылку на абстрактный класс
        final AbstractSmileProcessor fileSmileProcessor;
        // Ссылка fileSmileProcessor на обстрактный класс AbstractSmileProcessor,
        // инициализируется объектом подкласса, в котором реализованы
        // все абстрактные методы суперкласса.
        fileSmileProcessor = new FileSmileProcessor();
        fileSmileProcessor.process();
    }
}
