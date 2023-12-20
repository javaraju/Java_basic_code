package interview2023.java.StreamWithEmployeeClass;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String [] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Raju", 100000.50));
        employeeList.add(new Employee(2, "Vijay", 100000.50));
        employeeList.add(new Employee(3, "Hitesh", 300000.00));
        employeeList.add(new Employee(4, "Mohit", 100500.50));
        employeeList.add(new Employee(5, "Chandan", 203000.00));
        employeeList.add(new Employee(6, "Suraj", 340000.00));

        Map<Integer, String> map1 = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        Map<Integer, Employee> map2 = employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        Map<Double, List<Employee>> groupedByDepartment =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getSalary));

        System.out.println(groupedByDepartment);

        groupedByDepartment.forEach(
                (salary, employeesInDepartment) ->
                {
                    System.out.println(salary);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

        System.out.println("map1 --> " + map1);
        System.out.println("map2 ---> " + map2);


        // find second highest salary of employee

        Optional<Employee> secondHighestSalary = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst();
        Optional<Employee> firstHighestSalary = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();

        System.out.println(secondHighestSalary.get());
        System.out.println(firstHighestSalary.get());

    }
}
