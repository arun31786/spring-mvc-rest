package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationController {
	
//	@RequestMapping("/login")
	@RequestMapping(value="/login", method=RequestMethod.GET)
	protected ModelAndView login(){
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	protected ModelAndView getLogin(
			@RequestParam(value="user") String user,
			@RequestParam(value="pwd") String password
			
			){
		
		ModelAndView mv = null;
		
		if(user.equalsIgnoreCase(password) && user.trim().length()>0){
			mv = new ModelAndView("hello");
			mv.addObject("fname", user);
			mv.addObject("title", "Welcome");
		} else {
			mv = new ModelAndView("error");
			mv.addObject("errorMessage", "Credentials are not same");
			mv.addObject("title", "Error");
		}
		
		return mv;
	}
}
