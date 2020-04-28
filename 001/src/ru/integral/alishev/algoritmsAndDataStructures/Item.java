package ru.integral.alishev.algoritmsAndDataStructures;

/**
 * Класс предмета укладываемого в рюкзак.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 08.04.2020
 */
class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    /**
     * Ценность на еденицу веса.
     *
     * @return Удельная ценность для текущего предмета.
     */
    public double valuePerUnitOfWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{вес:" + weight + ", ценность:" + value + "}";
    }
}
