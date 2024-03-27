package ru.vtb.task5.repository;

import org.springframework.stereotype.Repository;
import ru.vtb.task5.model.AccountPool;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface AccountPoolRepo extends CrudRepository<AccountPool, Integer>{

    AccountPool findFirstByBranchAndCurrencyAndMdmCodeAndPriorityAndRegisterType(String branch, String currency, String mdmCode, String priority, String registryType);

}
