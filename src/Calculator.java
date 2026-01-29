public class Calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
     c.add(12,12);
     c.add(1,2,3);
    }
}
