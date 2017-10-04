package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Course;
import com.dto.YellowPage;

public class E05A_CollectionsDemo {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_05A_Collections.xml");
	YellowPage bean = context.getBean("yp", YellowPage.class);
	System.out.println(bean);
}
}
