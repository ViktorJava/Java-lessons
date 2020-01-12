import java.util.Scanner;

/**
 * Консольный типовой калькулятор.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.01.2020
 */
public class Calculator {
    private Scanner scanner;
    private boolean calculatorStarted;

    private Calculator() {
        scanner = new Scanner(System.in);
        calculatorStarted = true;
    }

    private void startCalculator() {

        boolean invalidInputs;

        while (calculatorStarted) {
            invalidInputs = false;
            System.out.print("Введи 1 для сложения \n" + "Введи 2 для вычитания \n"
                    + "Введи 3 для умножения \n" + "Введи 4 для деления \n" + "Введи 0 для выхода : ");

            int operator = scanner.nextInt();
            System.out.println();

            float firstNo = 0;
            float secondNo = 0;

            if (operator != 0) {
                System.out.print("Введи первое число : ");
                firstNo = scanner.nextFloat();
                System.out.print("Введи второе число : ");
                secondNo = scanner.nextFloat();
            }
            float result = 0;
            switch (operator) {
                case 1:
                    result = add(firstNo, secondNo);
                    break;

                case 2:
                    result = subtract(firstNo, secondNo);
                    break;

                case 3:
                    result = multiply(firstNo, secondNo);
                    break;

                case 4:
                    if (secondNo == 0) {
                        System.out.println("Хреновые данные \n");
                        invalidInputs = true;
                        break;
                    }
                    result = divide(firstNo, secondNo);
                    break;

                case 0:
                    calculatorStarted = false;
                    System.out.println("Выход... \n");
                    break;

                default:
                    invalidInputs = true;
                    System.out.println("Хреновые данные \n");
            }

            if (!invalidInputs && operator != 0) {
                System.out.println("Результат " + result);
                System.out.println();
            }
        }
    }

    private float add(float number1, float number2) {
        return number1 + number2;
    }

    private float subtract(float number1, float number2) {
        return number1 - number2;
    }

    private float multiply(float number1, float number2) {
        return number1 * number2;
    }

    private float divide(float number1, float number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }
}



