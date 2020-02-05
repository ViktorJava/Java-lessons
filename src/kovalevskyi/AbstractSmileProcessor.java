package kovalevskyi;

/**
 * Использование абстрактных классов и методов.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 28.01.2020
 */
public abstract class AbstractSmileProcessor {
    AbstractSmileProcessor() { //конструктор
    }

    public void process() { //собственный метод
        final String text = this.readString();
        final String result = text.replace(":-)", ":-(");
        System.out.println(result);
    }

    abstract String readString();
}
