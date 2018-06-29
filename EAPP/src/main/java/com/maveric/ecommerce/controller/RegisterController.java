package com.maveric.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maveric.ecommerce.modelclass.Gettersetter;


@Controller
public class RegisterController {
	@Autowired
	
	
	
	@RequestMapping(value = "/")
	public String register(Model modelobj) {
		modelobj.addAttribute("Gettersetter", new Gettersetter());
		System.out.println("Entered into Register page");
		return "register";
	}


	@RequestMapping(value = "/registerProcess")
	public String registerProcess() {
		
		return null;
		}
		
	}
	


