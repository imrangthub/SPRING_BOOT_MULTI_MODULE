package com.mymultimoduleworkshopv5.apione.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymultimoduleworkshopv5.core.service.CoreBaseService;

@RestController
public class HomeController {



	@Autowired
	private CoreBaseService coreBaseService;
	
	
	
	

	@GetMapping("/home")
	public String getMsgOne() {

		coreBaseService.getMsgOne();
		
		return "From api one Home Controller";
	}
	
	
	@GetMapping("/home2")
	public String getMsgOne2() {

		coreBaseService.getMsgOne2();
		
		return "From api one Home Controller";
	}

}
