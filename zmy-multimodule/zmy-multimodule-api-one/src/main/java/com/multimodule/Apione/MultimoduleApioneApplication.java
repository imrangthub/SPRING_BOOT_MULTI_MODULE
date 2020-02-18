package com.multimodule.Apione;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.multimodule.Apione","com.multimodule.core"})
public class MultimoduleApioneApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MultimoduleApioneApplication.class, args);
	}

}

