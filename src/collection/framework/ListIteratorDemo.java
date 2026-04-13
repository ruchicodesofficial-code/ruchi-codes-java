package collection.framework;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
    //| 10| 20| 30 |40|
        ListIterator<Integer> itr = list.listIterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//        while (itr.hasPrevious()){
//            System.out.println(itr.previous());
//        }
//        //add
//        while(itr.hasNext()){
//            int num = itr.next();
//            if(num==20){
//                itr.add(25);
//            }
//        }
//        //set
//        while(itr.hasNext()){
//            int num = itr.next();
//            if(num==20){
//                itr.add(25);
//            }
//        }
        //remove
        while(itr.hasNext()){
            int num = itr.next();
            if(num==10){
                itr.remove();

            }
        }
        System.out.println(list);
    }
}
