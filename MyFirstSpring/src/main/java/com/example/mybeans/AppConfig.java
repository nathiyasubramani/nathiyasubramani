package com.example.mybeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;

import com.example.mybeans.Person;
import com.example.mybeans.Product;

@Configuration
public class AppConfig {
	      @Bean
          @Scope("prototype")
           public String greeting()
           {
        	   return "Hello my friends";
           }

	       @Bean
           @Scope("prototype")
           public LocalTime show()
           {
            	return LocalTime.now();
           }

	       @Bean
           @Scope("prototype")
           public Person showPerson()
           {
               return new Person("Upasana",32);
           }

	       @Bean
           @Scope("prototype")
           public Product showProduct()
           {
                return new Product("TV",10);
           }
	       
	       @Bean
	       @Scope("prototype")
	       public Book showBook()
	       {
	    	   return new Book(101,"Tell me your dreams",121,"Sidney Sheldon",5);
	       }

}


