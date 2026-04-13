package oops.association.onetoone;

public class Test {
    public static void main(String[] args) {
        Address add = new Address("Indore","MP");
        Student s = new Student(1,"Tiya",add);
//        s.display();
        System.out.println(s.toString());

    }
}
