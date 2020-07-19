package ru.integral.patterns.strategy;

import java.util.Arrays;

/**
 * Insert sorting strategy.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.01.2020
 */
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
