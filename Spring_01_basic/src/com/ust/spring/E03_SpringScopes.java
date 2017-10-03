package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.spring.model.Message;

public class E03_SpringScopes {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Message msg1 = context.getBean("beanId", Message.class);
		msg1.setMessage("First object");
		
		Message msg2 = context.getBean("beanId", Message.class);
		msg2.setMessage("Second object");
		
		System.out.println(msg1);
		System.out.println(msg2);
		
		if(msg1 == msg2){
			System.out.println("These are same object ref no");
		} else {
			System.out.println("These are different ref no");
		}
		
		boolean isSingleton = context.isSingleton("beanId");
		System.out.println(isSingleton);
		boolean isPrototype = context.isPrototype("beanId");
		System.out.println(isPrototype);
		
//		String a = new String("some str");
//		String b = a;
		
		
	}

}
