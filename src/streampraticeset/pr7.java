package streampraticeset;
import java.util.*;
import java.util.stream.Collectors;

public class pr7 {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D") //[["A","B"],["C","D"]]
        );
        List<String> result = list.stream()
                .flatMap(l->l.stream())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
