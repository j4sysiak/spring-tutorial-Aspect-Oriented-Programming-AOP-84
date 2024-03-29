package com.jaceksysiak.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/aop/beans.xml");
 
		ICamera camera = (ICamera) context.getBean("camera");
		camera.snap();
		camera.snap(500);
		camera.snapNighttime();
		
		
		Car car = (Car) context.getBean("car");
		car.start();
	 
		
		((ClassPathXmlApplicationContext)context).close();
		  
		  
	}

}
