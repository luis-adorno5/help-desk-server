package com.luisyass.helpdesk.domain.account.services;

import com.luisyass.helpdesk.domain.account.model.Account;
import com.luisyass.helpdesk.domain.account.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepo accountrepo;

    @Autowired
    public AccountServiceImpl(AccountRepo accountrepo) {
        this.accountrepo = accountrepo;
    }

    public Account create(Account account) {
        return accountrepo.save(account);
    }

    @Override
    public Iterable<Account> getAllAccounts() {
        return accountrepo.findAll();
    }

}
