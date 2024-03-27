package ru.vtb.task5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.vtb.task5.model.Account;
import ru.vtb.task5.model.CreateProductRegisterRequest;
import ru.vtb.task5.repository.AccountPoolRepo;
import ru.vtb.task5.repository.AccountRepo;

@Service
public class AccountService {
    @Autowired
    private AccountPoolRepo accountPoolRepo;
    @Autowired
    private AccountRepo accountRepo;

    public Account GetAccountByParams(@RequestBody CreateProductRegisterRequest request){
        var pool = accountPoolRepo.findFirstByBranchAndCurrencyAndMdmCodeAndPriorityAndRegisterType(
                request.branchCode,
                request.currencyCode,
                request.mdmCode,
                request.priorityCode,
                request.registryTypeCode);
        // TODO не найден пул
        var account = accountRepo.findFirstByPoolOrderByAccountNumber(pool);
        // TODO не найден счёт
        return account;

    }
}
