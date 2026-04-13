package inheritance;

public class Animal {
    int a = 10;
    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Animal eats food");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

    }
}

