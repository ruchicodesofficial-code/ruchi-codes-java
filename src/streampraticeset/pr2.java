package streampraticeset;

import java.util.*;
import java.util.stream.*;

public class pr2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java","spring","hibernate");
        List<String> result = names.stream()
                .map(String::toUpperCase) //.map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
