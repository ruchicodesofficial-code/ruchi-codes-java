package java8features;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("riya","reema","uma");
        names.stream().forEach(System.out::println);
        names.parallelStream().forEach(System.out::println);
    }
}
