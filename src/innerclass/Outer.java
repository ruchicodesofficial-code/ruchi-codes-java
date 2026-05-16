package innerclass;

public class Outer {
    //member inner class
    int x = 10;
    class Inner{
        void show(){
            System.out.println("x= "+x);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
