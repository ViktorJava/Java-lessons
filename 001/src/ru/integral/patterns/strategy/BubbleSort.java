package ru.integral.patterns.strategy;

import java.util.Arrays;

/**
 * Bubble sorting strategy.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.01.2020
 */
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
