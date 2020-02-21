package com.mymultimoduleworkshopv7.apitwo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mymultimoduleworkshopv7.apitwo","com.mymultimoduleworkshopv7.core","com.mymultimoduleworkshopv7.shared"})
public class MultimoduleApioneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MultimoduleApioneApplication.class, args);
	}

}

