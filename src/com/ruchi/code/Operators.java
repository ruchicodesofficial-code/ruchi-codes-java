package com.ruchi.code;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
//        int a = 200;
//        int b  = 12;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
        //unary operators
        //++
//        int c = a++;
//        System.out.println(c);
//        c = a++;
//        System.out.println(c);
//        c = ++a;
//        System.out.println(c);
        //decrement operator
//        int x = 10;
//        int y = --x;
//        int y = x--;
//        System.out.println(y);
//        y = x--;
//        System.out.println(y);
        boolean isRunnig = false;
//        System.out.println(!isRunnig);
        //Relational operator
        int a = 120;
        int b = 120;
//        System.out.println(a==b);
//        System.out.println(a>b);
//        System.out.println(a!=b);
//        System.out.println(a>=b);

        //logical operator
        //&&
        int age  =20;
        boolean result = (age>18)&&(age<30);
//        System.out.println(result);
        //||
        int marks = 20;
//        marks = marks+5;
        marks-=5;
//        System.out.println(marks);
        boolean pass = (marks>=35)||(marks==40);
//        System.out.println(pass);
//        //!
//        boolean isRaining= false;
//        System.out.println(!isRaining);//true
        int p = 10;                        //0101
        int q = -3;                        //0011
        //System.out.println(p&q);        //0001  1
//        System.out.println(p|q);          //0111  7
//        System.out.println(p^q);         //0110   6
       // System.out.println(~p);   //00000101
                                 //11111010  -6
        //<<
//        p = p<<2;
//        System.out.println(p);
        //>>
        p = p>>1;
//        System.out.println(p);

//ternary operator
        //condition? valueIftrue:valseIfFalse;
        int personAge = 18;
        String msg = personAge>=18 ? "Adult":"Minor";
        System.out.println(msg);


    }
}
