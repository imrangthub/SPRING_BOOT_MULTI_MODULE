package com.multimodule.two.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/list")
	public String showMsg() {
		System.out.println("From Two No API HomeController");
		return "From Two No API HomeController";
	}

}
