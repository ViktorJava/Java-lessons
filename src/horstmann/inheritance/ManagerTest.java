package horstmann.inheritance;

/**
 * В этой программе демонстрируется наследование
 *
 * @author Cay Horstmann
 * @version 1.21
 * @since 02.21.2004
 */
public class ManagerTest {
    public static void main(String[] args) {
//        построить объект типа Manager
        Manager boss = new Manager("Viktor Vdovichenko", 5000, 2008, 8, 22);
        boss.setBonus(2000);

//        заполнить массив типа staff объектами Manager и Emplayee
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Ivan Ivanov", 3000, 2000, 2, 17);
        staff[2] = new Employee("Nikolay Petrov", 2500, 2001, 11, 1);

//        вывести данные обо всех объектах типа Employee
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + ", salary: " + e.getSalary());
        }
    }

//    вывод на консоль:
//    name= Viktor Vdovichenko, salary: 7000.0
//    name= Ivan Ivanov, salary: 3000.0
//    name= Nikolay Petrov, salary: 2500.0
}
