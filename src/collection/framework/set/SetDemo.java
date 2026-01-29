package collection.framework.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(30);
//        System.out.println(set);
//        Set<Integer> set1 = new LinkedHashSet<>();
//        set1.add(30);
//        set1.add(90);
//        set1.add(100);
//        System.out.println(set1);
       SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(20);
       sortedSet.add(10);
       sortedSet.add(40);
        sortedSet.add(30);
        System.out.println(sortedSet);
//        System.out.println(sortedSet.first());
//        System.out.println(sortedSet.last());
//        System.out.println(sortedSet.headSet(20));
//        System.out.println(sortedSet.tailSet(20));
//        System.out.println(sortedSet.subSet(10,40));




    }
}
