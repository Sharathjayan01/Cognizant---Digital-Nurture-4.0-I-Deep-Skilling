package com.loan.Loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.Loan.Model.Loans;
@Repository
public interface LoanRepo extends JpaRepository<Loans,String>{

}
