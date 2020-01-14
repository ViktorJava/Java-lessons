package patterns.singleton;

/**
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 14.01.2020
 */
class Singleton {
    /**
     * Хранится ссылка на единственный экземпляр данного класса.
     */
    private static volatile Singleton instance;
    static int counter = 0;

    /**
     * Закрытый конструктор.
     */
    private Singleton() {
        counter++;//здесь должен жить код с которым работает синглтон.
    }

    /**
     * Единственный метод синглтона и является аьтернативой конструктору
     * и точкой доступа к единственному инстансу класса.
     *
     * @return ссылка на единственный инстанс данного класса.
     */
    static Singleton getInstance() {
        if (instance == null) {
            //синхронизация по единственному для данного класса статическому объекту.
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}