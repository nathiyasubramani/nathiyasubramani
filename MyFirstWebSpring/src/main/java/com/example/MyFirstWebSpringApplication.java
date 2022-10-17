package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Execution point
@SpringBootApplication
//@ComponentScan -- look for the  based package--com.example
//@EnableAutoConfiguration -- auto configure many tools that are embed in SB  application
//@Configure --- all the codes written by the developer,are configured internally

public class MyFirstWebSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebSpringApplication.class, args);
	}

}
