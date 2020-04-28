package ru.integral.horstmann.inheritance;

/**
 * Класс Manager расширяет класс Employee.
 * перегружается родительский класс getSalary
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.12.2019
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * @param n     имя сотрудника.
     * @param s     зарплата.
     * @param year  год приёма на работу.
     * @param month месяц приёма на работу.
     * @param day   день приёма на работу.
     */
    Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

    void setBonus(double b) {
        this.bonus = b;
    }
}
