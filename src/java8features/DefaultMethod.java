package java8features;

public interface DefaultMethod {
    void show();
    default void msg(){
        System.out.println("Hello from default method");
    }
}
