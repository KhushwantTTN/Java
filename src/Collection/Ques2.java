package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(25.0, 2500.0, "John Doe"));
        employees.add(new Employee(30.0, 3000.0, "Alice Smith"));
        employees.add(new Employee(35.0, 3500.0, "Bob Johnson"));
        employees.add(new Employee(40.0, 4000.0, "Charlie Brown"));


        System.out.println("Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }


        Collections.sort(employees);


        System.out.println("After sorting:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getSalary());
        }



        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        };


        Collections.sort(employees, salaryComparator);
        System.out.println("Sorting base on salary:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}

