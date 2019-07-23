package com.congthang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import  com.congthang.model.User;
@Controller
public class UserController {
	@RequestMapping("/user")
	public String User() {
		return "user";
	}
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public String AddUser(@ModelAttribute("user") @Validated User user, BindingResult result) {
		if (result.hasErrors()) {
			return "user";
		}
		return "main";
	}
}
