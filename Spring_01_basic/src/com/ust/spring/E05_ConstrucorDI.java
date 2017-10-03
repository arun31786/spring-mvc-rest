package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class E05_ConstrucorDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("05-constructorBasedInjection.xml");
		
		System.out.println(context.getBean("studentById"));
	}
}
