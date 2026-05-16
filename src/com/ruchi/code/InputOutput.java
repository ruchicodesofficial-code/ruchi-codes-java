package com.ruchi.code;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
//        System.out.print("Hey ");
//        System.out.println("Hello");
//        System.out.println("Welcome");
//        int age = 25;
//        int dob = 12;
//        System.out.printf("My age %d and my dob is %d",age,dob);
        double num = 12.3333333;
//        System.out.printf("num is %.2f",num);
//        String s = "My name is";
//        String name = "ruchi";
//        System.out.printf("%s %s",s,name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.printf("My age is %d and my name is %s",age , name);
        sc.close();



    }
}
