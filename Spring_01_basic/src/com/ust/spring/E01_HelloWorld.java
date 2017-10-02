package com.ust.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ust.spring.model.Message;

public class E01_HelloWorld {
	public static void main(String[] args) {
//		Message message = new Message();
		
		BeanFactory factory = new XmlBeanFactory(
			new FileSystemResource("D:/bitbucket/IIHT/Spring 10days 2Oct/Spring_01_basic/src/spring.xml")
		);
		
		System.out.println(factory.getBean("beanId"));
		
		Message message = (Message) factory.getBean("beanId");
//		Person person = factory.getBean("personBeanId");
		
//		System.out.println(message);
//		message.setMessage("Hello user");
		
		System.out.println(message.getMessage());
	}

}
