package com.luisyass.helpdesk.domain.account.repo;

import com.luisyass.helpdesk.domain.account.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AccountRepo extends CrudRepository<Account, UUID> {

}
