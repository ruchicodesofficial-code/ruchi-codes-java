package streampraticeset;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,45,67,80,87);
        List<Integer> evenNum = num.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNum);

    }
}
