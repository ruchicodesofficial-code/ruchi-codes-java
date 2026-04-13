package java8features;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        //old way
        System.out.println("Old way");
        List<Integer> list = Arrays.asList(10,20,30,40,50,50);
        for(Integer in:list){
            if(in>20){System.out.println(in*2);
            }
        }
        //after stream api
        System.out.println("Stream api");
        list.stream().filter(i->i>20).map(i->i*2).forEach(System.out::println);
                    //Predicate()           //Function()      //Consumer()
        //using collector
        System.out.println("Using collector");
        List<Integer>newList = list.stream()
                .filter(x->x>20)
                .collect(Collectors.toList());
        System.out.println(newList );
        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
