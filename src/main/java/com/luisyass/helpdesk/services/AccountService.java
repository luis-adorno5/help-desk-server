package com.luisyass.helpdesk.services;

import com.luisyass.helpdesk.models.Account;

import java.util.List;

public interface AccountService {
    public Account create(Account account);
    public Iterable<Account> getAllAccounts();
}
