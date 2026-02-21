package streampraticeset;
import java.util.*;
import java.util.stream.*;
public class pr3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,3,1);
        Set<Integer> result = list.stream()
                .filter(e->Collections.frequency(list,e)>1)
                .collect(Collectors.toSet());
        System.out.println(result);
    }
}
