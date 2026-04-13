package streampraticeset;

import java.util.Arrays;
import java.util.List;

public class pr8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream()
                .reduce(0,Integer::sum);
        System.out.println("sum: "+ sum);
    }
}
