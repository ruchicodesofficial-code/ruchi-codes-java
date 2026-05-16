package streampraticeset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class pr6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,40,50);
        Integer secondHigh = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondHigh);
    }
}
