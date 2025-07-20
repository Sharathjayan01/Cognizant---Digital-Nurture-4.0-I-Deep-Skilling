package com.loan.Loan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.Loan.Model.Loans;
import com.loan.Loan.Service.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {
	private final LoanService serv;
	@Autowired
	public LoanController(LoanService serv) {
		this.serv=serv;
	}
	
	@GetMapping("/{AccountNumber}")
	public Loans getLoanDetails(@PathVariable String AccountNumber) {
		return serv.getLoanDetails(AccountNumber);
	}
}
