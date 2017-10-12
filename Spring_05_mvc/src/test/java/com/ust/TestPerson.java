package com.ust;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ust.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring.xml")
public class TestPerson {
	
	Person person = null;
	
	@Before
	public void setup() {
		System.out.println("running");
		person = new Person();
	}
	@Test
	public void testPerson(){
		assertNotNull(person);
		person.setName("Mike");
		person.setCountry("SouthAfrica");
		
		assertSame("name must be 'Mike'", person.getName(), "Mikle");
		assertSame("country must be 'SouthAfrica'", person.getCountry(), "SouthAfrica");
	}
	
	
	
}
