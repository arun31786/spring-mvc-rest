package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.House;

public class E04_InnerBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_04_innerBean.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		House house = context.getBean("house", House.class);
		System.out.println(house);
	}
}
