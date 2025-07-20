package com.loan.Loan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loans {
	@Id
	private String AccountNumber;
	private String type;
	private Integer loanAmt;
	private Integer emi;
	private Integer tenure;
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Integer getEmi() {
		return emi;
	}
	public void setEmi(Integer emi) {
		this.emi = emi;
	}
	public Integer getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(Integer loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String AccountNumber) {
		this.AccountNumber=AccountNumber;
	}
}
