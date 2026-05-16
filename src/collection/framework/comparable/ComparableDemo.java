package collection.framework.comparable;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>() ;
        list.add(new Student(3,"Ravi"));
        list.add(new Student(4,"Anita"));
        list.add(new Student(1,"Neha"));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.id+" "+s.name);
        }
    }
}
