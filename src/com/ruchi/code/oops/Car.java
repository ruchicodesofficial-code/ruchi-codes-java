package com.ruchi.code.oops;

public class Car {
    String color;
    String model;
    int speed;

    void start(){
        System.out.println("Car is starting");
    }
    void brake(){
        System.out.println("Applying brake");
    }
    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.start();

    }
}
