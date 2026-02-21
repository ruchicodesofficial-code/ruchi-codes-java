package streampraticeset;

import java.util.*;
import java.util.stream.*;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"veena",50000),
                new Employee(2,"geeta",30000),
                new Employee(3,"priya",60000),
                new Employee(4,"esha",30000)
        );
        employeeList.stream()
                .sorted(Comparator.comparing(e->e.salary))
                .forEach(e-> System.out.println(e.name+" "+e.salary));

        Map<Double,List<Employee>> grouped = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.salary));
        System.out.println(grouped);


    }
}
