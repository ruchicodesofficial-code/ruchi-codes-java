package com.ruchi.code.oops;

public class StaticMethod {
    static void show(){
        System.out.println("This is static method");
    }
void showName(){
    System.out.println("showing name");
}
    public static void main(String[] args) {
        StaticMethod.show();
        StaticMethod st = new StaticMethod();
        st.showName();
    }
}
