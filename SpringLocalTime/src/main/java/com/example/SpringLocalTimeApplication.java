package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.time.LocalTime;

@SpringBootApplication
public class SpringLocalTimeApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringLocalTimeApplication.class, args);

	    Object byName = context.getBean("greeting");
	    LocalTime byType = context.getBean(LocalTime.class);
	    LocalTime byBoth = context.getBean("greeting", LocalTime.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);

	} 
	    @Bean
	    public LocalTime greeting()
	    {
	    	return LocalTime.now();
	    }
	}

