package com.cognizant.account.api;

import org.springframework.web.bind.annotation.*;

record AccountDto(String number, String type, long balance) {}

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public AccountDto getAccount(@PathVariable String number) {
        // Dummy data; no DB
        return new AccountDto(number, "savings", 234343L);
    }
}
