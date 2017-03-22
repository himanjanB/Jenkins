package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld hW = (HelloWorld) appContext.getBean("helloWorld");
		hW.sayHello();
		Person person = (Person) appContext.getBean("person");
		System.out.println("Hello " + person.getFirstName() + " " + person.getLastName());
		User user = (User) appContext.getBean("user");
		Car car = user.getCar();
		System.out.println(car.getName());
		System.out.println(car.getFuelCost());

		((AbstractApplicationContext) appContext).close();
	}
}