package com.multimoduleworkshopv1.core.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String getMsg1(){
		
		System.out.println("This message from Workshop v1 core MyService Ms1  up001");
		return "This message from Workshop v1 core MyService Ms1";
		
	}
	
	public String getMsg2(){
		
		System.out.println("This message from Workshop v1 core MyService Ms2  up001");
		return "This message from Workshop v1 core MyService Ms2";
		
	}
	
	

}
