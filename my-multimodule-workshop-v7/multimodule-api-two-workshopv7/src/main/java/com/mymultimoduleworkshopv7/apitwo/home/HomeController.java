package com.mymultimoduleworkshopv7.apitwo.home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mymultimoduleworkshopv7.core.service.CoreBaseService;

@RestController
@RequestMapping("/api/two")
public class HomeController {


	@Autowired
	private CoreBaseService coreBaseService;
	
	

	@GetMapping("/home")
	public String getMsgOne() {

		coreBaseService.getMsgOne();
		
		return "From api Two Home Controller v7";
	}
	
	
	@GetMapping("/home2")
	public String getMsgOne2() {

		coreBaseService.getMsgOne2();
		
		return "From api Two Home Controller v7";
	}

}
