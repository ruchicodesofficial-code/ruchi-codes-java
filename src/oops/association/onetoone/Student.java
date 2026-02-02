package oops.association;

public class Student {
    int id;
    String name;
    Address address;
    Student(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
//    void display(){
//        System.out.println(id+" "+name);
//        System.out.println(address.city+" "+address.state);
//    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
