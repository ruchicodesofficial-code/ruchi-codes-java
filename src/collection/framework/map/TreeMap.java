package collection.framework.map;
import java.util.*;

public class TreeMap {
    public static void main(String[] args) {
        /*
        * no null key
        * null values allowed
        *no  duplicate key
        */
        Map<Integer,String> map = new java.util.TreeMap<>();
        map.put(3,"science");
        map.put(5,"maths");
        map.put(1,"social study");
        System.out.println(map);
    }
}
