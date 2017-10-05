package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.JdbcDaoImpl;
import com.demo.User;

public class TestJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		JdbcDaoImpl jdbcDaoImpl = context.getBean("dao", JdbcDaoImpl.class);
		
//		jdbcDaoImpl.insertUser(new User(34, "Pramod", "ust@123"));
		
		for(int i=0;i<10;i++){
			jdbcDaoImpl.insertUser(new User(i*8, "Hello"+i, "Hello"+i));
		}
		
	}
}
