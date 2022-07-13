package com.luisyass.helpdesk.domain.account.controller;

import com.luisyass.helpdesk.domain.account.model.Account;
import com.luisyass.helpdesk.domain.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private AccountService accountService;

    @Autowired
    public Controller(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/accounts")
    public void createAccount(@RequestBody Account account) {
        accountService.create(account);
    }
}
