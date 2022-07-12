package com.luisyass.helpdesk.controller;

import com.luisyass.helpdesk.models.Account;
import com.luisyass.helpdesk.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private AccountService accountService;

    @Autowired
    public Controller(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }
}
