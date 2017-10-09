package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ust.dao.DummyDb;
import com.ust.entity.User;

@Controller
public class UserController {
	
	DummyDb db = new DummyDb();

	// render login page
	@RequestMapping(value="/login2", method=RequestMethod.GET)
	public ModelAndView getLoginPage(){
		return new ModelAndView("login2");
	}
	
	@RequestMapping(value="/login2", method=RequestMethod.POST)
	public String getLoggedIn(@ModelAttribute User user, Model model){
		System.out.println(user);
		boolean isValid = db.isLoggedIn(user);
		if(isValid){
			model.addAttribute("title", "Welcome");
			model.addAttribute("user", user);
			return "welcome2";
		}
		else {
			model.addAttribute("title", "Error");
			model.addAttribute("errorMessage", "Invalid user");
			return "error";
		}
	}
	
	// render login page
	@RequestMapping(value="/register2", method=RequestMethod.GET)
	public ModelAndView getRegisterPage(){
		return new ModelAndView("register2");
	}

	@RequestMapping(value="/register2", method=RequestMethod.POST)
	public String getRegistered(@ModelAttribute User user, Model model){
		boolean isNew = db.isRegistered(user);
		if(isNew){
			model.addAttribute("user", user);
			model.addAttribute("title", "Registered Successfully");
			return "welcome2";
		} else {
				model.addAttribute("title", "Error");
				model.addAttribute("errorMessage", "User is already available in our database..");
				return "error";
			}
	}


}
