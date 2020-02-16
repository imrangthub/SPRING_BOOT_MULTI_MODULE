package com.multimoduleworkshopv3.apione;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.multimoduleworkshopv3.core.service.MyService;


@RestController
public class HomeController {
	
	
	@Autowired
	private MyService myService;
	
	

	@GetMapping("/msg1")
	public String msg1(HttpServletRequest request) {
		
		myService.getMsg1();
		
		return "Home Controller msg1";
		
	}
	
	@GetMapping("/msg2")
	public String msg2(HttpServletRequest request) {
		
	myService.getMsg2();
		
		return "Home Controller msg2";
		
	}

}
