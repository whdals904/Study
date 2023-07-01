package jm.study.basic.flatmap;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("김종민");
        employee.setSalary(100000);

        Employee employee1 = new Employee();
        employee1.setName("김종윤");
        employee1.setSalary(200000);

        Employee employee2 = new Employee();
        employee2.setName("김아름");
        employee2.setSalary(300000);

        Manager manager = new Manager();
        manager.setName("관리자1");
        manager.setSalary(1);
        manager.getEmployeeList().add(employee);
        manager.getEmployeeList().add(employee2);

        Manager manager1 = new Manager();
        manager1.setName("관리자2");
        manager1.getEmployeeList().add(employee1);

   /*     System.out.println("manager = " + manager);
        System.out.println("manager1 = " + manager1);*/

        List<Manager> list = new ArrayList<>();
        list.add(manager);
        list.add(manager1);

        //list.stream().forEach(System.out::println);
        //Arrays.asList(manager, manager1).stream().forEach(System.out::println);
        int sum = Arrays.asList(manager, manager1).stream().flatMap(m-> Stream.concat(m.getEmployeeList().stream(), Stream.of(m))).distinct().mapToInt(Employee::getSalary).sum();
        System.out.println("sum = " + sum);
    }
}

@Getter
@Setter
@ToString
class Manager extends Employee{
    private List<Employee> employeeList = new ArrayList<>();
}

@ToString
@Getter
@Setter
class Employee{
    private String name;
    private int salary;
}
