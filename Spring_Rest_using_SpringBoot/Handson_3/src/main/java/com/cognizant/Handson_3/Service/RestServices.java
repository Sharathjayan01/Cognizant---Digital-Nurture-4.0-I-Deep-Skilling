package com.cognizant.Handson_3.Service;

import org.springframework.stereotype.Service;

@Service
public class RestServices {
	public String getHome() {
		return "Welcome to the Homepage";
	}
	
	public String getHellopage() {
		return "Hello World!...";
	}

}
