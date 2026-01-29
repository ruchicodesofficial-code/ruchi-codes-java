package collection.framework.list;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list.add(10);
        list.add(12);
        list.add(90);
        list.add(90);
//        System.out.print(list+" ");
//        System.out.println(list.get(1));
//        System.out.println(list.remove(1));
//        System.out.print(list+ "");
//        System.out.println(list.size());
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for(Integer val:list){
            System.out.print(val+" ");
        }
    }
}
