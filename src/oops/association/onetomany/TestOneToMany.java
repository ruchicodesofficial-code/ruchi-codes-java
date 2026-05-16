package oops.association.onetomany;

import java.util.ArrayList;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Aman");
        Employee e2 = new Employee(102,"Neha");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        Department dept = new Department("IT",employeeList);
//        dept.showEmployees();

        System.out.println(dept.toString());
    }
}
