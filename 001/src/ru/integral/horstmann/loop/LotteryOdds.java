package ru.integral.horstmann.loop;

import java.util.*;

/**
 * В этой программе демонстрируется применение цикла for
 * Данная программа вычисляет вероятность выигрыша в лотерее.
 * Если нужно угадать 6 номеров из 50, колличество возможных вариантов
 * будет 15_890_700
 * <p>
 * формула расчета:(n * (n - 1) * (n - 2) *...* (n - k + 1) / (1 * 2 * 3 *...* k)
 * где k-номеров из n
 * <p>
 * Core Java volume 1 - fundamentals Ninth edition Cey S.Horstmann page 108
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 19.10.2019
 */
public class LotteryOdds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Как много номеров необходимо угадать? ");
        int k = in.nextInt();

        System.out.print("Как много номеров всего существует? ");
        int n = in.nextInt();

        // Вычисляем биномиальный коэффициент по формуле:
        // (n * (n - 1) * (n - 2) *...* (n - k + 1) / (1 * 2 * 3 *...* k)
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Вы угадаете числа за " + lotteryOdds + " попыток");
    }
}
// вывод на экран:
// >> Как много номеров необходимо угадать? 6
// >> Как много номеров всего существует? 50
// >> Вы угадаете числа за 15_890_700 попыток