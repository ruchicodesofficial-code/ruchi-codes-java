package com.ruchi.code;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to my calculator");
        int choice = 1;
        while(choice!=0) {
            System.out.println("num1: ");
            int num1 = sc.nextInt();
            System.out.println("num2: ");
            int num2 = sc.nextInt();
            System.out.println("enter operation you want to perform( +,-,*,/,%) ");
            char op = sc.next().charAt(0);

            if (op == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (op == '-') {
                System.out.println("Result: " + (num1 - num2));

            } else if (op == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (op == '/') {
                System.out.println("Result: " + (num1 / num2));
            } else if (op == '%') {
                System.out.println("Result: " + (num1 % num2));

            } else {
                System.out.println("Invalid operation");
            }
            System.out.println("Do wanna exit ? enter 0 for exit and 1 to continue");
            choice = sc.nextInt();
        }
sc.close();
    }
}
