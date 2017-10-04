package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Employee;
import com.dto.Manager;

public class E01_InhertanceDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_01_inheritance.xml");
		Manager bean = context.getBean("manager", Manager.class);
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(bean);
	}
}
