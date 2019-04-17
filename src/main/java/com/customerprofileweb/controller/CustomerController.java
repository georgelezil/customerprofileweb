package com.customerprofileweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(){
		ModelAndView modelAndViewObj = new ModelAndView();
		modelAndViewObj.setViewName("hello");
		modelAndViewObj.addObject("name","Lezil");
		return modelAndViewObj;
	}

}
