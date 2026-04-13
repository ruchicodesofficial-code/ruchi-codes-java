package com.ruchi.code;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mini Calculator");
        System.out.println("You can perform various operations like +,-,*,/");
        System.out.println("Enter first num: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second num:  ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operator (+,/,*,-)");
        char op = sc.next().charAt(0);
        double result;
        if(op=='+'){
            result = num1+num2;
            System.out.println("Result: "+result);
        }
        else if(op=='-'){
            System.out.println("Result: "+(num1-num2));
        } else if (op == '*') {

            System.out.println("Result: "+(num1*num2));
        } else if (op == '/') {
            if(num2!=0){
                System.out.println("Result: "+(num1/num2));
            }else{
                System.out.println("Cannot divide by zero!");
            }

        }
        else{
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}
