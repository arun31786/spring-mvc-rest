package com.spring.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.Book;
import com.dto.Company;

public class E01_Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(E01_BasicConfig.class);
		System.out.println(context);
		
		Book book = context.getBean(Book.class);
		System.out.println(book);
		
		Company company = context.getBean(Company.class);
		System.out.println(company);
	}
}
