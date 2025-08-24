package com.cognizant.Handson_4.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.Handson_4.Country;
@Service
public class CountryService {
	@SuppressWarnings("resource")
	private static final ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
	Country con=null;
	private List<Country>l1=(List<Country>)context.getBean("countryList");
			//context.getBean("country",Country.class);
	
	public List<Country> getAllCountry() {
		
		
		return l1;
	}
	public Country getSingleCountry() {
		
		return l1.stream().filter(p->p.getCode().equals("IN")).findFirst().orElse(con);
	}
	public Country getByIdCountry(String id) {
		
		return l1.stream().filter(p->p.getCode().equals(id)).findFirst().orElse(con);
	}
}
