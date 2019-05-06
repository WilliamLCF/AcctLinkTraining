package com.esun.example.web.controller;
 

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.esun.example.model.HelloWorld;

@Controller
public class HelloWorldController {
	@GetMapping(value= {"/","/home"})
	public String getHome(Model model) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld); 
		return "index.html";
	}

	@GetMapping("/markup")
	public String markupPage() {
		return "markup.html";
	}

	@GetMapping("/params")
	public String paramsPage() {
		return "params.html";
	}

	@GetMapping("/other")
	public String otherPage(Model model) {
		return "other.html";
	}

}
