package arrays;

/**
 * Хорошо известно, что нативная функция Java System.arraycopy () является полезным способом копирования одного
 * массива в другой, поскольку она является нативной.
 * Чтобы ответить на эти вопросы, я сделал простой тест и запустил его как программу Java на своем ПК
 * <p>
 * Вот результаты при запуске его с моего компьютера (Java 11, 8 ГБ памяти, процессор Intel i5):
 * <p>
 * Размер массива: 10_000_000
 * Наивный алгоритм - 139 мс
 * System.arraycopy(); - 20 мс
 *
 * Метод System.arraycopy() принимает несколько параметров.
 *
 * Первым параметром является массив-источник.
 * Вторым параметром является позиция начала нового массива.
 * Третий параметр — массив-назначения.
 * Четвертый параметр является начальным положением целевого массива.
 *
 * источник: http://www.aviyehuda.com/blog/2011/06/25/android-quick-tip-use-system-arraycopy/
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.10.2019
 */
public class ArrayCopyTest {

    private static final int SIZE_OF_ARRAY = 10_000_000;
    private static long time;


    public static void main(String[] args) {

        Integer[] sourceArray = new Integer[SIZE_OF_ARRAY];
        Integer[] destinationArray = new Integer[SIZE_OF_ARRAY];
        fillArray(sourceArray);

        startBenchmark();
        naiveCopy(sourceArray, destinationArray);
        stopBenchmark();

        startBenchmark();
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        stopBenchmark();
    }

    private static void naiveCopy(Integer[] src, Integer[] dst) {
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    private static void fillArray(Integer[] src) {
        for (int i = 0; i < src.length; i++) {
            src[i] = i;
        }
    }

    private static void startBenchmark() {
        time = System.currentTimeMillis();
    }

    private static void stopBenchmark() {
        time = System.currentTimeMillis() - time;
        System.out.println("time=" + time);
    }

}
