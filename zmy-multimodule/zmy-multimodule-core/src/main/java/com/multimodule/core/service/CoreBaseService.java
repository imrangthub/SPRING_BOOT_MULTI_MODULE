package com.multimodule.core.service;

import org.springframework.stereotype.Service;

@Service
public class CoreBaseService {
	
	
	public String getMsgOne() {
		
		System.out.println("Msg from Cor Base Service");
		
		return "Msg from Cor Base Service";
	}
	
	public String getMsgOne2() {
		
		System.out.println("Msg from Cor Base Service22222");
		
		return "Msg from Cor Base Service22222";
	}
	
	

}
