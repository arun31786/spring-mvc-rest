package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Item;

public class E07_AnnotationsDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_07_annotations.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		Item bean = context.getBean("item", Item.class);
		System.out.println(bean);
		Item bean1 = context.getBean("item", Item.class);
		System.out.println(bean1);
		System.out.println(bean == bean1);
	}
}
