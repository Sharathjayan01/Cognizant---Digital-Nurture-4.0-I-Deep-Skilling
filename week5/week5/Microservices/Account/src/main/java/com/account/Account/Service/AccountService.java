package com.account.Account.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.Account.Model.Account;
import com.account.Account.Repository.AccountRepo;

@Service
public class AccountService {
	
	private final AccountRepo repo;
	@Autowired
	public AccountService(AccountRepo repo) {
		this.repo=repo;
	}
	
	public Account getAccount(String AccountNumber) {
		Optional<Account> acc=repo.findById(AccountNumber);
		return acc.orElse(null);
		
	}

}