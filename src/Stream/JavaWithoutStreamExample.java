package Stream;

import java.util.ArrayList;
import java.util.List;
public class JavaWithoutStreamExample {
    private static List < Employee > employeeList = new ArrayList < Employee > ();

    public static void main(String[] args) {

        // Adding Employees
        employeeList.add(new Employee(100, "Raghav", 25000));
        employeeList.add(new Employee(298, "Abhishek", 32000));
        employeeList.add(new Employee(263, "Rishabh", 28000));
        employeeList.add(new Employee(344, "Deepika", 28000));
        employeeList.add(new Employee(115, "Aruna", 90000));
        // Without Java 8 Stream API'S
        withoutStreamAPI();
    }

    private static void withoutStreamAPI() {
        // without Stream API's
        List < Float > employeeSalaryList = new ArrayList < Float > ();
        // filtering data of list
        for (Employee employee: employeeList) {
            if (employee.getSalary() > 25000) {
                // adding price to a employeeSalaryList
                employeeSalaryList.add(employee.getSalary());
            }
        }

        // displaying data
        for (Float salary: employeeSalaryList) {
            System.out.println(salary);
        }
    }
}