package java8features;

import multithreading.interthreadcommunication.Consumer;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30);
        //lambda expression
        list.forEach(x-> System.out.println(x));

        //method reference
        list.forEach(System.out::println);

    }
}
