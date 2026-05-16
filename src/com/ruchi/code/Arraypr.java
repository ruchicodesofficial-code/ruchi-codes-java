package com.ruchi.code;
/*
*  Find largest element
  Find smallest element
  Reverse array
  Sum of array elements
 Search a number
 Copy one array to another
*/

import java.util.Scanner;

public class Arraypr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("-----Result-------");
//        findLargest(arr);
//        findSmallest(arr);
       // reverseArray(arr);
//        sumOfArray(arr);
//        searchNum(arr,sc);
        copyOneTOAnother(arr);

        sc.close();
    }
    static  void findLargest(int[] arr){
        int max = arr[0]; //1,22,33,44,3
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }

        }
//        System.out.println("Largest Element: "+max);

    }
    static void findSmallest(int[]arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Result: "+min);
    }

    static void reverseArray(int arr[]){
        int start=0;
        int end = arr.length-1;
        //1,2,3,4,5
        //5,4,3,2,1
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;//1
            start++;
            end--;
        }
        System.out.println("Reversed Array: ");
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
    static void sumOfArray(int arr[]){
    int sum =0;
    //10,20,30,40,50
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of all elements: "+sum);
    }
    static void searchNum(int arr[],Scanner sc){
        //10,30,45,66
        System.out.println("Enter number you wanna search: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+" found at index "+ arr[i]);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println(target+" not found.");
        }
    }
    static void copyOneTOAnother(int []arr){
    int[] copyArray = new int[arr.length]; //arr = 10,20,30
    for(int i=0;i<arr.length;i++){
        copyArray[i] = arr[i];
    }
        System.out.println("copied Array= ");
printArray(copyArray);
    }
    static void printArray(int arr[]){
        for(int x:arr){
            System.out.println(x+" ");
        }
        System.out.println();
    }
}
