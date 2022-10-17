package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.time.LocalTime;

@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);

	    Object byName = context.getBean("greeting");
	    String byType = context.getBean(String.class);
	    String byBoth = context.getBean("greeting", String.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);

	}

//	    @Bean
//	    public String greeting() {
//	        return "Hello, World";
//	    }
//	    @Bean
//	    public LocalTime greeting1()
//	    {
//	    	return LocalTime.now();
//	    }
	    
	}

