package com.springcore.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
    public Engine(){
        System.out.println("Engine bean created");
    }
    @PostConstruct
    public void init(){
        System.out.println("Engine initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Engine bean destroyed!!");
    }
    public void start(){
        System.out.println("Engine started....");
    }
}
