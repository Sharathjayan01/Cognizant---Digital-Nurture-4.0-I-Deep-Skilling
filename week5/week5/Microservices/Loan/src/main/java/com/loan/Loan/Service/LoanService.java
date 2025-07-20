package com.loan.Loan.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.Loan.Model.Loans;
import com.loan.Loan.Repository.LoanRepo;


@Service
public class LoanService {

	
	private final LoanRepo repo;
	@Autowired
	public LoanService(LoanRepo repo) {
		this.repo=repo;
	}
	
	
	public Loans getLoanDetails(String AccountNumber) {
		Optional<Loans> acc=repo.findById(AccountNumber);
		
		return acc.orElse(null);
	}
}
