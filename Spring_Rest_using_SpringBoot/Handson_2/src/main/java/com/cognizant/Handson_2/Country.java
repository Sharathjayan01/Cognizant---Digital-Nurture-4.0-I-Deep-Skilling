package com.cognizant.Handson_2;

public class Country {
	private String code;
	private String name;
	public Country() {
		System.out.println("Country class Invoked");	
		
	}
	
	public void setCode(String code) {
		this.code=code;
	}
	public String getCode() {return this.code;}
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
	
	public String toString() {
		return "Code: "+getCode()+" Name: "+getName()+" ";
	}
}
