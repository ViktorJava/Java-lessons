package ru.integral.patterns.strategy;

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
    private static int[] fillRandom(int size, int range) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient(); //context.

        strategyClient.setStrategy(new BubbleSort()); // change context strategy.
        strategyClient.executeStrategy(fillRandom(10, 10));

        strategyClient.setStrategy(new InsertSort());
        strategyClient.executeStrategy(fillRandom(20, 100));

        strategyClient.setStrategy(new SelectionSorting());
        strategyClient.executeStrategy(fillRandom(30, 1000));
    }
}
