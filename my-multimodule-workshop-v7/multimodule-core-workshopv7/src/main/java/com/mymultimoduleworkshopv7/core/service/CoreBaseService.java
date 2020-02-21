package com.mymultimoduleworkshopv7.core.service;

import org.springframework.stereotype.Service;

@Service
public class CoreBaseService {
	
	
	public String getMsgOne() {
		
	System.out.println("From Core# Common Welcome Message For all API");
		
		return "From Core# Common Welcome Message For all API";
	}
	
	public String getMsgOne2() {
		
		System.out.println("From Core# Second Common Welcome Message For all API");
		
		return "From Core# Second Common Welcome Message For all API";
	}
	
	
}
	
	

