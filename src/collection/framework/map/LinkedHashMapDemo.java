package collection.framework.map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(3,"python");
        map.put(1,"java");
        map.put(2,"c++");
        map.put(null,"c#");
        map.put(null,"html");
        map.put(5,null);
        map.put(6,null);
        System.out.println(map);

    }
}
