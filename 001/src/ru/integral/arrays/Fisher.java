package ru.integral.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Бывает необходимость перемешать элементы массива в случайном порядке.
 * В интернете нашёл готовый метод по алгоритму Fisher–Yates
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.10.2019
 */
public class Fisher {
    /**
     * метод перемешивания массива
     *
     * @param ar перемешиваемый массив
     */
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String[] args) {
        int[] arrayNoSort = {1, 5, 6, 3, 2, 6, 44, 25, 13};
//        массив до перемешивания
        System.out.println("до перемешивания: "+Arrays.toString(arrayNoSort));
        shuffleArray(arrayNoSort);
//        массив после перемешивания
        System.out.println("после перемешивания: "+Arrays.toString(arrayNoSort));
    }
}
