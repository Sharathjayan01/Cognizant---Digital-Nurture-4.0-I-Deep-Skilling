package com.account.Account.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	private String AccountNumber;
	private String type;
	private Integer balance;
	
	
	
	public void setAccountNumber(String AccountNumber) {this.AccountNumber=AccountNumber;}
	public String getAccountNumber() {return AccountNumber;}
	public void setType(String type) {this.type=type;}
	public String getType() {return type;}
	public void setBalance(int balance) {this.balance=balance;}
	public int getBalance() {return balance;}
}
