package com.mymultimoduleworkshopv7.shared.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymultimoduleworkshopv7.core.service.CoreBaseService;

@Service
public class SharedBaseService {
	

	@Autowired
	private CoreBaseService coreBaseService;
	
	
	public String getSpecifyFeatureForApiTwo() {
		
	System.out.println("From Shared# This is a spcial feature for only need API Two");
		
		return "From Shared# This is a spcial feature for only need API Two";
	}
	
	public String getMsgOneFormCore() {
		
		System.out.println("From Shared# Call Common Core Library From Shared Library.");
		
		coreBaseService.getMsgOne();
		
		return "From Shared# Call Common Core Library Welcome Message One From Shared Library.";
	}
	
	
}
	
	

