package innerclass;

public class LocalInnerClass {
    void display(){
        class Inner{
            void show(){
                System.out.println("Local inner class");
            }
        }
        Inner i = new Inner();
        i.show();
    }
    public static void main(String[] args) {

        LocalInnerClass l = new LocalInnerClass();
        l.display();
    }
}
