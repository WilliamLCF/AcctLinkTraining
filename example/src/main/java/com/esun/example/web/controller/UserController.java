package com.esun.example.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esun.example.dao.UserDao;
import com.esun.example.model.User;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String welcome(Model model) {

		logger.debug("query user"); 
		
		List<User> users = userDao.findAll();

		System.out.println(users);

		model.addAttribute("user", users);
		
		return "welcome.html";

}
}
