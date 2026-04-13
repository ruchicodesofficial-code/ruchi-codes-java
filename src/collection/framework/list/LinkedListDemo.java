package collection.framework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("ruchi");
        names.add("ruchi");
        names.add("java");
        names.add("programming");
        names.add("rishee");
//        System.out.println(names);
        names.addFirst("start");
        names.addLast("end");
//        System.out.println(names);
//        System.out.println(names.get(3));
//        names.remove();
//        names.removeLast();
//        names.removeFirst();
//        System.out.println(names);
//        System.out.println(names.size());
//
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
