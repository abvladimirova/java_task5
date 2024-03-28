package ru.vtb.task5.service;

import ru.vtb.task5.model.Account;

import java.util.HashMap;
import java.util.Map;

public interface AccountService {

    Account GetAccountByParams(Map<String,Object> params);

}
