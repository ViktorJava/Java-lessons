package patterns.strategy;

import java.util.Arrays;
import java.util.Random;

/**
 * В этом приложении реализован паттерн проектирования Стратегия.
 * В приложении, применяется три алгоритма сортировки одномерного массива:
 * пузырьковая, выборкой и вставкой.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 11.01.2020
 */
public class StrategyApp {
    /**
     * Метод заполнения массива случайными числами.
     *
     * @param size  размер массива.
     * @param range диапазон случайных чисел.
     * @return случайно заполненный массив.
     */
    public int[] fillRandom(int size, int range) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient(); //context.
        StrategyApp strategyApp = new StrategyApp();

        strategyClient.setStrategy(new BubbleSort()); // change context strategy.
        strategyClient.executeStrategy(strategyApp.fillRandom(10, 10));

        strategyClient.setStrategy(new InsertSort());
        strategyClient.executeStrategy(strategyApp.fillRandom(10, 100));

        strategyClient.setStrategy(new SelectionSorting());
        strategyClient.executeStrategy(strategyApp.fillRandom(10, 1000));
    }
}

// Strategy
class StrategyClient {
    Sorting strategy;// sort object reference

    // change strategy
    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    // start strategy
    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}

// Context
interface Sorting {
    void sort(int[] array);
}

//Bubble sorting strategy.
class BubbleSort implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Bubble sorting.");
        System.out.println("Before:\t" + Arrays.toString(array));
        /*Берем элемент в конце массива. И проходим массив от конца до начала.*/
        for (int i = array.length - 1; i >= 0; i--) {
            /*В этом вложенном цикле мы идем от 0 до i, т.е. до текущего шага цикла.*/
            for (int j = 0; j < i; j++) {
                /*Если условие arr[j]>arr[j+1] выполняется, то
                 * мы используем перестановку элементов*/
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("After:\t" + Arrays.toString(array));
    }
}

//Insert sorting strategy.
class InsertSort implements Sorting {
    @Override
    public void sort(int[] array) {
        int key;
        System.out.println("Insert sorting.");
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("After:\t" + Arrays.toString(array));
    }
}

//Selection sorting strategy.
class SelectionSorting implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Selection sorting.");
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = min;
                array[min_i] = tmp;
            }
        }
        System.out.println("After:\t" + Arrays.toString(array));
    }
}