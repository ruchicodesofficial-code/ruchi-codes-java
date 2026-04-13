package com.ruchi.code.oops;

public class Student {
    int id;
    String name;
    int rollno;
    // default constructor
    Student(){
        System.out.println("I am default constructor");
    }
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    //Parameterized Constructor
    Student(int i,String name,int rollno){
        id = i;
        this.name = name;
        this.rollno = rollno;

    }
    void study(){
        System.out.println("id is "+id+" "+ name+" is studying.");
    }
    void showDetails(){
        System.out.println("id is "+id+" and name is "+name+" and roll no is "+rollno);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101,"Ritesh",12223);
        Student s2 = new Student(102,"uma");

        s1.study();
        s2.study();
        s1.showDetails();


    }
}
