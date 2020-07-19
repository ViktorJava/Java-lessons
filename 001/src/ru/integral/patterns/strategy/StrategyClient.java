package ru.integral.patterns.strategy;

/**
 * Context.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 13.01.2020
 */
class StrategyClient {
    private Sorting strategy; // sort object reference aggregation

    /**
     * Change strategy
     *
     * @param strategy Strategy class instance.
     */
    void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    /**
     * Start strategy
     *
     * @param array Array data.
     */
    void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}
