package com.ruchi.code;

public class Variables {
    //instance variable
    String name = "Rohan";
    int age = 27;
    void displayNameAge(){
        System.out.println("My name is "+name+" and my age is "+age);
    }
    //static variable
    static String schoolName = "ABC School";
    void printSchool(){
        System.out.println("my school name is "+schoolName);
    }
void display(){
    //local variable
    int num = 10;
    System.out.println(num);
}
    public static void main(String[] args) {
//        int age = 25;
//        String name = "ruchi";
//        System.out.println(age);
//        System.out.println(name);
        Variables var = new Variables();
//        var.display();
//        var.displayNameAge();
        var.printSchool();

    }
}
