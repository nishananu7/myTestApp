package com.example.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@GetMapping(path="/home")
	public String homePage() {
		String home="Welcome";
		return home;
	}

}
