package collection.framework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>(3);
////        System.out.println(array.size());
//        array.add(10);
//        array.add(20);
//        array.add(30);
//        System.out.println(array);
        ArrayList<String> list = new ArrayList<>();
        list.add("riya");
        list.add("esha");
//        System.out.println(list);
        list.add(1,"nisha");
//        System.out.println(list);

//        System.out.println(list.get(0));
//        list.set(1,"sachin");
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains("rey"));
//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for(String names: list){
//            System.out.println(names);
//        }
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
