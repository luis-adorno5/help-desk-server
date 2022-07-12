package com.luisyass.helpdesk.repos;
import com.luisyass.helpdesk.models.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AccountRepo extends CrudRepository<Account, UUID> {

}
