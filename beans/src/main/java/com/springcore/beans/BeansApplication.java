package com.springcore.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeansApplication.class, args);
		Car car = context.getBean(Car.class);
//		car.drive();

		Engine e1 = context.getBean(Engine.class);
		Engine e2 = context.getBean(Engine.class);
		System.out.println(e1==e2);
	}

}
