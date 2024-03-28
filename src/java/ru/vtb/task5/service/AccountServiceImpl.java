package ru.vtb.task5.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.vtb.task5.model.Account;
import ru.vtb.task5.repository.AccountPoolRepo;
import ru.vtb.task5.repository.AccountRepo;

import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {
    //@Autowired
    private AccountPoolRepo accountPoolRepo;
    //@Autowired
    private AccountRepo accountRepo;

    @Override
    public Account GetAccountByParams(Map<String,Object> params){
        /*var listPool = accountPoolRepo.findAll();
        var account = accountRepo.findFirstByPoolOrderByAccountNumber(listPool.iterator().next());*/
        var pool = accountPoolRepo.findFirstByBranchAndCurrencyAndMdmCodeAndPriorityAndRegisterType(
                (String)params.get("branchCode"),
                (String)params.get("currencyCode"),
                (String)params.get("mdmCode"),
                (String)params.get("priorityCode"),
                (String)params.get("registryTypeCode"));
        // TODO не найден пул
        var account = accountRepo.findFirstByPoolOrderByAccountNumber(pool);
        // TODO не найден счёт
        return account;
    }
}
