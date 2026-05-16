package abstraction;

abstract class Vehicle {
    int a = 12;
    Vehicle(){
        System.out.println("Abstract class constructor");
    }
    abstract void start();
    public void fuel(){
        System.out.println("Tank full");
    }
}
