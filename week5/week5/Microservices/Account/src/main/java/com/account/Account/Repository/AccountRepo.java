package com.account.Account.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.Account.Model.Account;

public interface AccountRepo extends JpaRepository<Account,String> {

}
