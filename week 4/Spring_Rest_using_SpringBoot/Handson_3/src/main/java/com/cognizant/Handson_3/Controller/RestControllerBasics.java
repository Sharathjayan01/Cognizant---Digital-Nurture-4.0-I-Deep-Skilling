package com.cognizant.Handson_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Handson_3.Service.RestServices;

@RestController
public class RestControllerBasics {
	@Autowired
	private RestServices serv;
	@GetMapping("/")
	public ResponseEntity<String> getHomePage(){
		return new ResponseEntity<>(serv.getHome(),HttpStatus.OK);
	}
	@GetMapping("/hello")
	public ResponseEntity<String> getHelloPageCont(){
		return new ResponseEntity<>(serv.getHellopage(),HttpStatus.OK);
	}
}
