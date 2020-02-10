package com.multimoduleworkshopv1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.multimoduleworkshopv1"})
public class MyMultimoduleWorkshopvOneApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MyMultimoduleWorkshopvOneApp.class, args);
	}

}

