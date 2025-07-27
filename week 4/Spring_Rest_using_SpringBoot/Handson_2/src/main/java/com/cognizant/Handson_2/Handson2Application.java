package com.cognizant.Handson_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Handson2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Handson2Application.class, args);
		displayCountry();
	}
	public static void displayCountry() {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country con=context.getBean("country",Country.class);
		System.out.println(con);
	}

}
