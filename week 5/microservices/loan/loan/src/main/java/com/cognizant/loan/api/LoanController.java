package com.cognizant.loan.api;

import org.springframework.web.bind.annotation.*;

record LoanDto(String number, String type, long loan, int emi, int tenure) {}

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public LoanDto getLoan(@PathVariable String number) {
        // Dummy data; no DB
        return new LoanDto(number, "car", 400000, 3258, 18);
    }
}
