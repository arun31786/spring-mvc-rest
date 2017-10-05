package com.spring.annot;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.dto.Book;
import com.dto.Company;
import com.dto.Employee;

@Configuration
//@Import(DatabaseConfig.class)
public class E01_BasicConfig {
//	<bean id="book" class="com.dto.Book">
//		<property name="price" value="123.45"/>
//	</bean>
	
	@Bean
	public Book getBook(){
		Book book = new Book();
		book.setPrice(123.45f);
		return book;
	}
	
	@Bean
	public Employee getEmp(){
		Employee emp = new Employee();
		emp.setSalary(45000.99);
		emp.setName("Miley");
		emp.setAge(24);
		emp.setDept("Security");
//		emp.setDob(new Date("10-10-2017"));
		emp.setWorkExperience(5);
		return emp;
	}
	
	@Bean
	public Company getCompany(){
		Company comp = new Company(getEmp());
		comp.setAddress("New York");
		return comp;
	}
	
}





