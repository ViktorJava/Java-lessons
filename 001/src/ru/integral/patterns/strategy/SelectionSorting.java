package ru.integral.patterns.strategy;

import java.util.Arrays;

/**
 * Selection sorting strategy.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.01.2020
 */
class SelectionSorting implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println("Selection sorting.");
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int mini = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int tmp = array[i];
                array[i] = min;
                array[mini] = tmp;
            }
        }
        System.out.println("After:\t" + Arrays.toString(array));
    }
}
