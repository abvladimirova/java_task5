package ru.vtb.task5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vtb.task5.model.Account;
import ru.vtb.task5.model.AccountPool;

@Repository
public interface AccountRepo extends CrudRepository<Account, Integer> {
    Account findFirstByPoolOrderByAccountNumber(AccountPool pool);
}
