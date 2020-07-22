package ru.integral.arrays;

/**
 * простые операции с массивом
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 23.10.2019
 */
public class ArrayTest {
    public static void main(String[] args) {
        System.out.print("присвоение значения массиву arr[4]=10: ");
        int[] arr = new int[10];
        arr[4] = 10;
        System.out.println(arr[4]);

        System.out.print("заполнение массива циклом do while:");
        int i = 0;
        do {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            i++;
        } while (i < arr.length);

        System.out.println();

        System.out.print("заполнение массива циклом for: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j;
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        System.out.print("Вывод массива foreach: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        //объявление и инициализация массива
        int[] small = {1, 2, 3};
    }
}
