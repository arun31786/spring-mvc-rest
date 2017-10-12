package com.ust.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class I18NController {

	@Autowired
    private MessageSource messageSource;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getI18nPage(Locale locale, Model model){
		System.out.println(locale);
        String welcome = messageSource.getMessage("welcome.greetMessage", new Object[]{"Pramod"}, locale);
        model.addAttribute("greetMessage", welcome);
        
		return "i18n";
	}
}
