package com.mymultimoduleworkshopv6.apione;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mymultimoduleworkshopv6"})
public class MultimoduleApioneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MultimoduleApioneApplication.class, args);
	}

}

