package collection.framework.comparable;
import java.util.*;
public class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.id- s.id;
    }

}
