package com.multimodule.shared.base;

import org.springframework.stereotype.Service;

@Service
public class BaseService {
	
	public void  testMsg() {
		System.out.println("From Shared base Service");
	}

}
