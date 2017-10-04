package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Library;

public class E06_AutowireDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_06_autowire.xml");
		Library beanByName = context.getBean("libraryByName", Library.class);
//		beanByName = context.getBean("libraryByType", Library.class);
//		beanByName = context.getBean("libraryByConstructor", Library.class);
		
		System.out.println(beanByName);
		
//		java.text.SimpleDateFormat format;

	}
}
