package com.ust.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.entity.Person;
import com.ust.store.PersonStore;

@Controller
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	private PersonStore store;
	
	@RequestMapping(value = "/rest/persons", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Person> getAllPersons() {
		logger.info("Start getAllPersons.");
		List<Person> list = new ArrayList<Person>();
		Set<Integer> idKeySet = store.getPersonMap().keySet();
		for(Integer i : idKeySet){
			list.add(store.getPersonMap().get(i));
		}
		return list;
	}
	
	@RequestMapping(value = "/rest/person/{id}", method = RequestMethod.GET)
	public @ResponseBody Person getPerson(@PathVariable("id") int id) {
		logger.info("Start getPerson. ID="+id);
		System.out.println(store);
		return store.getPersonMap().get(id);
	}
	
	@RequestMapping(value = "/rest/person", method = RequestMethod.POST)
	public @ResponseBody Person createPerson(@RequestBody Person person) {
		logger.info("Start createPerson.");
		person.setCreatedDate(new Date());
		store.getPersonMap().put(person.getId(), person);
		return person;
	}
	
	@RequestMapping(value = "/rest/person/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Person deletePerson(@PathVariable("id") int id) {
		logger.info("Start deletePerson.");
		Person emp = store.getPersonMap().get(id);
		store.getPersonMap().remove(id);
		return emp;
	}
	
}
