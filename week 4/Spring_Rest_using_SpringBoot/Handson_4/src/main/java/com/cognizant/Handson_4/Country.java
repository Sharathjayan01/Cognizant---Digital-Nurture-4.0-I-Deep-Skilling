package com.cognizant.Handson_4;

public class Country {
	public Country() {
		System.out.println("Invoking Country");
	}
	
	private String name;
	private String code;
	
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
	public void setCode(String code) {
		this.code=code;
	}
	public String getCode() {
		return this.code;
	}
	
	@Override
	public String toString() {
		return "Code: "+getCode()+" Name: "+getName()+" ";
	}
	
}
