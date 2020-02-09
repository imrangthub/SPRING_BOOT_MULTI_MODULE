package com.example.multimodule.home;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.service.MyService;


@RestController
public class HomeController {
	
	
	@Autowired
	private MyService myService;
	
	

	@GetMapping("/test")
	public String pathResultEntryGridList(HttpServletRequest request) {
		
		myService.getMsg();
		
		return "From Home Controller";
		
	}

}
