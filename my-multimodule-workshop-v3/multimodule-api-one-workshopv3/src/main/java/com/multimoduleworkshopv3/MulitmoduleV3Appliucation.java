package com.multimoduleworkshopv3;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.multimoduleworkshopv3.apione", "com.multimoduleworkshopv3.core"})
public class MulitmoduleV3Appliucation extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MulitmoduleV3Appliucation.class, args);
	}

}


