package com.multimodule.Apione.home;
import com.multimodule.core.service.CoreBaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



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
