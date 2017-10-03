package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.spring.model.Person;

public class E04_LifeCycle {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("04-lifeCycleSpring.xml");
		// register context to shutdown
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		
//		((ConfigurableApplicationContext) context).close();
//		((ConfigurableApplicationContext) context).refresh();
		
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person1);
		
		
	}

}
