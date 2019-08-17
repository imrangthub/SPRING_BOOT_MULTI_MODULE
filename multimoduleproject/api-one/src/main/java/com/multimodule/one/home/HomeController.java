package com.multimodule.one.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.multimodule.shared.base.BaseService;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	private BaseService baseService;
	
	@GetMapping("/list")
	public String showMsg() {
		System.out.println("From API one HomeController");
		baseService.testMsg();
		return "From API one HomeController";
	}

}
