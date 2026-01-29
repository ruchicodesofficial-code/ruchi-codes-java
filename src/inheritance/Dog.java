package inheritance;

public class Dog extends Animal{
    int a = 20;
    Dog(){
//        super();
        System.out.println("child constructor");
    }

    void show(){
        System.out.println(super.a);
    }
    void bark(){
        System.out.println("Dog barks");
    }
    void eat(){
        super.eat();
        System.out.println("Dog eat");
    }

    public static void main(String[] args) {
      Dog d = new Dog();
//      d.eat();
//      d.bark();
//      d.show();

    }
}
