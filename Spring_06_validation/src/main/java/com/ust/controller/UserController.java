package com.ust.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.entity.User;

@Controller
@RequestMapping("/signup")
public class UserController {
	@RequestMapping(method=RequestMethod.GET)
	public String getSignForm(Model model){
		model.addAttribute("user", new User());
		return "signup";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String submitDetails(@Valid User user, BindingResult result){
		System.out.println(user);
		if(result.hasErrors()){
			return "signup";
		}
		
		return "success";
	}
}
