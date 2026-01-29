package polymorphism;


class Parent{
    void show(){
        System.out.println("This is parent class method");
    }

}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("This is child class method");
    }

}
public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
