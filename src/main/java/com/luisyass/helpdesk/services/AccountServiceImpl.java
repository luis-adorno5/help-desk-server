package com.luisyass.helpdesk.services;

import com.luisyass.helpdesk.models.Account;
import com.luisyass.helpdesk.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepo accountrepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountrepo) {
        this.accountrepo = accountrepo;
    }

    public Account create(Account account){
        return accountrepo.save(account);
    }

    @Override
    public Iterable<Account> getAllAccounts() {
        return accountrepo.findAll();
    }

}
