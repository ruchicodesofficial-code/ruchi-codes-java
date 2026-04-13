package oops.association.onetoone;

public class Address {
    String city;
    String state;

    Address(String city,String state){
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
