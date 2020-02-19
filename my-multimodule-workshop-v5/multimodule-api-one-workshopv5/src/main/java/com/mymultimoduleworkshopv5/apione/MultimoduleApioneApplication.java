package com.mymultimoduleworkshopv5.apione;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mymultimoduleworkshopv5.Apione","com.mymultimoduleworkshopv5.core"})
public class MultimoduleApioneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MultimoduleApioneApplication.class, args);
	}

}

