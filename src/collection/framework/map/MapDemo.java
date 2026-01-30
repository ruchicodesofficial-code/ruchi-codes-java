package collection.framework.map;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        //HashMap - only 1 null key allowed
        Map<Integer,String> map = new HashMap<>();
        //put
        map.put(1,"Ruchi");
        map.put(2,"Riya");
        map.put(3,"Ridaa");
//        System.out.println(map);
        //get
//        System.out.println(map.get(2));
        //remove
//        map.remove(1);
//        System.out.println(map);
        //Duplicate key concept
        map.put(2,"Rahul");
//        System.out.println(map);
        //null key / null value
        map.put(null,"Arya");
        map.put(4,null);
//        System.out.println(map);
        //containsKey(Object key)
//        System.out.println(map.containsKey(1));
//containsValue(Object value)
        System.out.println(map.containsValue("Arya"));
        //size
        System.out.println(map.size());
        //isEmpty
        System.out.println(map.isEmpty());
        //keySet()
        System.out.println(map.keySet());
        //values
        System.out.println(map.values());
        //entrySet
        System.out.println(map.entrySet());
        //clear
//        map.clear();
//
        map.putIfAbsent(6,"richa");
        System.out.println(map);
        Map<Integer,String> table = new Hashtable<>();
//        table.put(1,"Ruchi");
//        table.put(null,"Admin");
//        System.out.println(table);


    }


}
