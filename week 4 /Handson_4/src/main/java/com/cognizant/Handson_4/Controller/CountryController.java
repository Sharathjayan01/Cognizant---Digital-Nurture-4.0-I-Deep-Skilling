package com.cognizant.Handson_4.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Handson_4.Country;
import com.cognizant.Handson_4.Service.CountryService;

@RestController
public class CountryController {
	@Autowired
	private CountryService serv;
	@GetMapping("/countries")
	public ResponseEntity<List<Country>> getCountry(){
		return  ResponseEntity.ok(serv.getAllCountry());
	}
	@GetMapping("/country")
	public ResponseEntity<Country> getAllCountry(){
		return ResponseEntity.ok(serv.getSingleCountry());
	}
	@GetMapping("/country/{id}")
	public ResponseEntity<Country> getByCode(@PathVariable String id){
		return ResponseEntity.ok(serv.getByIdCountry(id.toUpperCase()));
	}
}
