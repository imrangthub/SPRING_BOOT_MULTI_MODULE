package com.example.multimodule.service;


import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String getMsg(){
		
		System.out.println("This msg from My Service in Library module  Updsate");
		
		return "This msg from My Service in Library module";
	}

}
