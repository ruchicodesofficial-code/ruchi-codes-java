package innerclass;

public class StaticInnerClass {
    static int x = 20;
    static class Inner{
        void show(){
            System.out.println("x= "+x);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass s = new StaticInnerClass();
        StaticInnerClass.Inner i = new StaticInnerClass.Inner();
        i.show();
    }
}
