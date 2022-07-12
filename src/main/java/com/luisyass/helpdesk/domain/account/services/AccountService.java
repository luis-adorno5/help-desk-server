package com.luisyass.helpdesk.domain.account.services;

import com.luisyass.helpdesk.domain.account.model.Account;

public interface AccountService {
    public Account create(Account account);

    public Iterable<Account> getAllAccounts();
}
