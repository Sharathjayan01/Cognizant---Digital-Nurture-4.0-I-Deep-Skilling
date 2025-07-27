package com.account.Account.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.Account.Model.Account;
import com.account.Account.Service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	private final AccountService serv;
	@Autowired
	public AccountController(AccountService serv) {
		this.serv=serv;
	}
	@GetMapping("/{AccountNumber}")
	public Account getAccountDetails(@PathVariable String AccountNumber) {
		
		return serv.getAccount(AccountNumber);
	}

}
