package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.time.LocalTime;

import com.example.mybeans.Person;
import com.example.mybeans.Product;
import com.example.mybeans.Book;

@SpringBootApplication
public class MyFirstSpringApplication1 {

	public static void main(String[] args) {
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication1.class, args);

	    Object byName = context.getBean("showPerson");
	    Person byType = context.getBean(Person.class);
	    Person byBoth = context.getBean("showPerson", Person.class);

	    Object byName1 = context.getBean("show");
	    LocalTime byType1 = context.getBean(LocalTime.class);
	    LocalTime byBoth1 = context.getBean("show",LocalTime.class);

	    Object byName2 = context.getBean("showProduct");
	    Product byType2 = context.getBean(Product.class);
	    Product byBoth2 = context.getBean("showProduct", Product.class);

	    Object byName3 = context.getBean("showBook");
	    Book byType3 = context.getBean(Book.class);
	    Book byBoth3 = context.getBean("showBook", Book.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	    
	    System.out.println(byName1);
	    System.out.println(byType1);
	    System.out.println(byBoth1);
	    
	    System.out.println(byName2);
	    System.out.println(byType2);
	    System.out.println(byBoth2);
	    
        System.out.println(byName3);
	    System.out.println(byType3);
	    System.out.println(byBoth3);
	    
	    

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


