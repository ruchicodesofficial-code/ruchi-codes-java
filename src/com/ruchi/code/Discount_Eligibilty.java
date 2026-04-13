package com.ruchi.code;

import java.util.Scanner;

public class Discount_Eligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = sc.nextInt();
        System.out.println("Are you student?(true/false)");
        boolean isStudent = sc.nextBoolean();
        if(age<=18&&isStudent==true){
            System.out.println("you will get 50% discount");
        }
        else{
            System.out.println("No discount");
        }
        sc.close();
    }
}
