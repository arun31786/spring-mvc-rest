package com.ust;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.controller.LoginController;
import com.ust.dto.User;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring01.xml");
		LoginController controller = context.getBean("controller", LoginController.class);
		User user = context.getBean("user", User.class);
		Scanner scanner = new Scanner(System.in);
		Locale locale = new Locale("en", "US");
//		Locale locale = new Locale("hi", "IN");
				
				
		System.out.println(context.getMessage("app.user", null, "Enter userid", locale));
		user.setUserid(scanner.next());
		System.out.println(context.getMessage("app.pass", null, "Enter password", locale));
		user.setPassword(scanner.next());
		
		user = controller.getLogin(user);
		
		user.showStatus(locale);
	}
}
