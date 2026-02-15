package java8features;

import java.util.Optional;

public class NullPointerException {
    public static void main(String[] args) {
        String name = "Java";
        Optional<String> optName = Optional.ofNullable(name);
        System.out.println("Is value present? "+optName.isPresent());
        System.out.println("Length: "+optName.get().length());
        String city = null;
        Optional<String> optCity = Optional.ofNullable(city);
        System.out.println("City: "+optCity.orElse("Delhi"));
    }
}
