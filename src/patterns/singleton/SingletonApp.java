package patterns.singleton;

/**
 * Проверяем синглтон на предмет его работы.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.01.2020
 */
public class SingletonApp {

    public static void main(String[] args) {
        Singleton[] array = new Singleton[100];
        for (int i = 0; i < 100; i++) {
            array[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}

