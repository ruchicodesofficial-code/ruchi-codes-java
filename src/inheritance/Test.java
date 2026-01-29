package inheritance;

class Parent {
    Parent(int x){
        System.out.println("parent value: "+ x);
    }
}
class Child extends Parent{
    Child(){
        super(100);
        System.out.println("Child constructor");
    }

}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();

    }
}

