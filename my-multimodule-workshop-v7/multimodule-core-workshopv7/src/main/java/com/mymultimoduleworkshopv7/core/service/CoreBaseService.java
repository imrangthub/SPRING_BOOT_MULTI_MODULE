package com.mymultimoduleworkshopv7.core.service;

import org.springframework.stereotype.Service;

@Service
public class CoreBaseService {
	
	
	public String getMsgOne() {
		
	System.out.println("This is Msg One from Cor Base Service  Projecrt v7");
		
		return "Msg from Cor Base Service 7";
	}
	
	public String getMsgOne2() {
		
		System.out.println("This is Msg Two from Cor Base Service  Projecrt v7");
		
		return "Msg from Cor Base Service 7";
	}
	
	
}
	
	

