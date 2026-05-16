package com.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car Bean created..");
    }
    public void drive(){
      engine.start();
        System.out.println("Car is running....");
    }
}
