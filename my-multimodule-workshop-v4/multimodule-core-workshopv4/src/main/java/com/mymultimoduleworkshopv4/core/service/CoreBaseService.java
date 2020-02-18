package com.mymultimoduleworkshopv4.core.service;

import org.springframework.stereotype.Service;

@Service
public class CoreBaseService {
	
	
	public String getMsgOne() {
		
	System.out.println("Msg from Cor Base Service 000 v555 11");
		
		return "Msg from Cor Base Service 000   v555 11";
	}
	
	public String getMsgOne2() {
		
		System.out.println("Msg from Cor Base Service 000 v555");
		
		return "Msg from Cor Base Service 000   v555";
	}
	
	

}

