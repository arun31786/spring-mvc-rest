package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ust.spring.model.Message;

/*
 * Simple integeration with AOP
 * MessageResource (I18N)
 * Event Propagation
 * WebApplicationContext
*/

public class E02_BeanFactoryVsAppContext {
	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("D:/bitbucket/IIHT/Spring 10days 2Oct/Spring_01_basic/src/spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println(context);
//		Message msg = (Message) context.getBean("beanId");
		Message msg = context.getBean("beanId", Message.class);
		
		System.out.println(msg);
	}


}
