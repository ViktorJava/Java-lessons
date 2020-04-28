package ru.integral.horstmann.inheritance;

/**
 * В этой программе демонстрируется наследование.
 *
 * @author ViktorJava (gipsyscrew@gmail.com)
 * @version 0.1
 * @since 05.12.2019
 */
public class TestClass {
    public Employee[] emps = new Employee[3];

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        testClass.emps[0] = new Employee("employee", 11111, 2222, 12, 21);
        testClass.emps[1] = new Manager("manager", 11111, 2222, 12, 21);
        testClass.emps[2] = new Programmer("programmer", 11111, 2222, 12, 21);

        System.out.println(testClass.emps[1].getName());
        //Manager m = (Manager) e1;
        for (Employee employee : testClass.emps) {
            if (employee instanceof Manager) {
                //можно так сделать понижение типа от Employee до Manager и вызов метода setBonus класса Manager
                Manager manager = (Manager) employee;
                manager.setBonus(123);
                //другой вариант понижение типа от Employee до Manager и вызов метода setBonus класса Manager
                ((Manager) employee).setBonus(222);
            }
            System.out.println(employee.getSalary() + " " + employee.getName());
        }
    }
}
