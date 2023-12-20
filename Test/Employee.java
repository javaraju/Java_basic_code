package Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Employee {
        private String name;

        private String sequence;
        private int age;
        private Double salary;

    public Employee(String name, String sequence, int age, Double salary) {
        this.name = name;
        this.sequence = sequence;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}

class Main{
    public static void main(String[] args) {
        List<Employee> el = new ArrayList<>();
        el.add(new Employee("A", "set by the program",35,4000.50));
        el.add(new Employee("B", "set by the program",22,2500.50));
        el.add(new Employee("C", "set by the program",30,3500.00));

        AtomicInteger ai = new AtomicInteger(1);
        List<Employee> resultList = el.stream().map(employee -> {
            employee.setSalary(employee.getSalary()*2);
            return employee;
        }).sorted(Comparator.comparingInt(Employee::getAge)).map(employee -> {
            employee.setSequence(String.valueOf(ai.getAndIncrement()));
            return employee;
        }).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        Iterator<Employee> iterator = resultList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee.getName() + " " + employee.getSequence() + " " + employee.getAge() + " " + employee.getSalary());
        }
    }
}



//class Main{
//    public static void main(String[] args) {
//        List<Employee> el = new LinkedList<>();
//
//        el.add(new Employee("A", "set by the program",35,4000.50));
//        el.add(new Employee("B", "set by the program",22,2500.50));
//        el.add(new Employee("C", "set by the program",30,3500.00));
//
//        AtomicInteger counter = new AtomicInteger(1);
//        List<Employee> newEmployees = el.stream().map(emp -> {
//            emp.setSalary(emp.getSalary() * 2);
//            return emp;
//        }).sorted(Comparator.comparingInt(Employee::getAge)).map(employee -> {
//            employee.setSequence(String.valueOf(counter.getAndIncrement()));
//            return employee;
//        }).collect(Collectors.toList());
//
//        for (Employee employee : newEmployees){
//            System.out.println(employee.getName() + " " + employee.getSequence() + " " + employee.getAge() + " " + employee.getSalary());
//        }
//    }
//}






//    Person Name A, sequence = set by the program , Age 35, Pay 4000.50
//        Person Name B, sequence = set by the program , Age 22, Pay 2500.50
//        Person Name C, sequence = set by the program , Age 30, Pay 3500
//
//
//
//
//
//        Add it in a list .
//        Using stream
//        double the pay.
//        Set the sequence to be incremented as 1,2,3 based on ordered by Age
//
//
//
//
//
//        return the list
//
//
//
//
//
//        Expected results
//        1.
//        print all the values of the object
//        Person Name A, sequence = 3 , Age 35, Pay 8001
//        Person Name B, sequence = 1 , Age 22, Pay 5001
//        Person Name C, sequence = 2 , Age 30, Pay 7000