package com.ust.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ust.model.Item;

@Controller
public class ItemController {
	
	@RequestMapping(value="/xmlItem", 
			method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody Item getXmlItem(){
		return new Item(123, "Book");
	}
	
	@RequestMapping(value="/jsonItem", 
			method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Item getJsonItem(){
		return new Item(321, "Shirt");
	}
	
	@RequestMapping(value="/items", 
			method=RequestMethod.POST, 
			produces=MediaType.APPLICATION_XML_VALUE, 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Item createItem(@RequestBody Item item){
		item.setName("new item");
		System.out.println(item);
		return item;
	}
	
	
	
	

}
