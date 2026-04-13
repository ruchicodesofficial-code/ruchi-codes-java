package polymorphism;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return  a+b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println( c.add(12,3,4));
        System.out.println(c.add(9.99,9.89));

    }
}
