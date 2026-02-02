package collection.framework.comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list  = new ArrayList<>();
        list.add(new Student(3,"Ravi"));
        list.add(new Student(1,"Shruti"));
        list.add(new Student(2,"Neha"));
        Collections.sort(list,new ComparatorDemo());
        for(Student s:list){
            System.out.println(s.id+" "+s.name);
        }
    }
}
