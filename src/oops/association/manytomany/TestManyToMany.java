package oops.association.manytomany;

import java.util.ArrayList;
import java.util.List;

public class TestManyToMany {
    public static void main(String[] args) {
        Course c1 = new Course("Java");
        Course c2 = new Course("Spring");

        List<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);

        Student s1 = new Student(1,"uma",courseList);
        System.out.println(s1.toString());
    }
}
