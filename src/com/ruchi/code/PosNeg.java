package com.ruchi.code;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(num+ " is negative");
        }else if(num>0){
            System.out.println(num+" is positive");
        }
        else{
            System.out.println("It is zero");
        }
        sc.close();
    }
}
