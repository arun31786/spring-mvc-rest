package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Company;

public class E02_DependencyInjection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_02_di.xml");
		Company bean = context.getBean("comp", Company.class);
		Company bean2 = context.getBean("comp2", Company.class);
		System.out.println(bean);
		System.out.println(bean2);
	}
}
