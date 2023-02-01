package Stream;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
public class JavaStreamExample {
    private static List < Employee > EmployeeList = new ArrayList < Employee > ();

    public static void main(String[] args) {

        // Adding Employees
        EmployeeList.add(new Employee(101, "Ritik", 22000));
        EmployeeList.add(new Employee(812, "aastha", 30000));
        EmployeeList.add(new Employee(333, "Kapil", 28000));
        EmployeeList.add(new Employee(234, "Lalit", 28000));
        EmployeeList.add(new Employee(155, "Pramada", 90000));
        // With Java 8 Stream API'S
        withStreamAPI();
    }

    private static void withStreamAPI() {
        // filtering data of list
        List < Float > EmployeeSalaryList = EmployeeList.stream().filter((Employee) -> Employee.getSalary() > 25000)
                .map((Employee) -> Employee.getSalary()).collect(Collectors.toList());
        // displaying data
        EmployeeSalaryList.forEach((price) -> System.out.println(price));
    }
}