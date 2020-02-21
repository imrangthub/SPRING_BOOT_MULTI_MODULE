package com.mymultimoduleworkshopv7.apitwo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymultimoduleworkshopv7.shared.service.SharedBaseService;

@RestController
@RequestMapping("/api/two")
public class HomeController {

	@Autowired
	private SharedBaseService sharedBaseService;

	@GetMapping("/home")
	public String getMsgOne() {

		sharedBaseService.getSpecifyFeatureForApiTwo();

		return "From API TWO Home Controller v7";
	}

	@GetMapping("/home2")
	public String getMsgOne2() {

		sharedBaseService.getMsgOneFormCore();

		return "From API TOW Home Two Controller v7";
	}

}
