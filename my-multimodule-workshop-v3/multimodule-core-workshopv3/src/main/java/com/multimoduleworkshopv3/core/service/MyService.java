package com.multimoduleworkshopv3.core.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String getMsg1(){
		
		System.out.println("This message from Workshop v3 core MyService Ms1  === Ok 2 ======");
		
		return "This message from Workshop v1 core MyService Ms1";
		
	}
	
	public String getMsg2(){
		
		System.out.println("This message from Workshop v3 core MyService Ms2 === ok === 2");
		
		return "This message from Workshop v1 core MyService Ms3";
		
	}
	
	

}