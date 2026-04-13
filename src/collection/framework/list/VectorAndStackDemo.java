package collection.framework.list;

import java.util.Stack;
import java.util.Vector;

public class VectorAndStackDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
//        System.out.println("v = " + v);
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
//        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.empty());

    }
}
