package ru.integral.alishev.algoritmsAndDataStructures;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Задача о рюкзаке.
 * Уложить как можно большее число ценных вещей в рюкзак
 * при условии, что вместимость рюкзака ограничена.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @see "https://www.youtube.com/watch?v=h2Bskvf5M-4&list=PLAma_mKffTOT_qpTFv4KdD9DhOAUd5Rqy&index=9"
 * @since 08.04.2020
 */
public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(2, 14);
        final Item item3 = new Item(3, 18);
        final Item[] items = {item1, item2, item3}; // набор предметов

        // сортируем массив предметов по удельной ценности в обратном порядке (от большего к меньшему)
        // cложность O(N*log(N))
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int W = 7; // вместимость рюкзака
        int weightSoFar = 0; // текущий вес
        double valueSoFar = 0; // текщая ценность
        int currentItem = 0; // индекс текущего предмета
        while (currentItem < items.length && weightSoFar != W) {
            //если накопленный вес и вес текщего объекта меньше вместимости рюкзака
            if (weightSoFar + items[currentItem].getWeight() < W) {
                //берём объект целиком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                // берём только часть объекта
                // вычисляем сколько можем взять объектов и делим на полный вес объекта
                // получаем часть объекта которую можем взять и умножаем на полную ценность нашего объекта.
                // Получаем ценность той части которую можем взять.
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight())
                        * items[currentItem].getValue();
                weightSoFar += W; // рюкзак стал полным
            }
            currentItem++;
        }
        System.out.println("ценность лучшего набора: " + valueSoFar);
    }
}
