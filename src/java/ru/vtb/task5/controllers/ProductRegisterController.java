package ru.vtb.task5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vtb.task5.model.Account;
import ru.vtb.task5.service.AccountServiceImpl;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductRegisterController {
    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping ("/corporate-settlement-account/create")
    public ResponseEntity<Account> createProductRegister(@RequestBody Map<String, Object> request) {

        try {
            var account = accountService.GetAccountByParams(request);
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(account);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
            //return ResponseEntity.status(HttpStatus.NOT_FOUND);
        }

   }

/*
	Атрибут	                                Системное имя	    Тип [Формат]	Обяз -	Описание

    Идентификатор экземпляра продукта	    instanceId	        integer sequence	+	Идентификатор ЭП, к которому привязывается продуктовый регистр
    Тип регистра	                        registryTypeCode	string	            -	Тип создаваемого продуктового регистра
    Тип счета	                            accountType	        string	            -	Клиентский или внутрибанковский
    Код валюты	                            currencyCode	    string	            -	3-х значный код валюты
    Код филиала	                            branchCode	        string	            -	Код филиала
    Код срочности	                        priorityCode	    string	            -	Всегда «00» для ПП РО ЮЛ
    Id клиента	                            mdmCode	            string	            -	МДМ код клиента (КЮЛ)
    Код клиента	                            clientCode	        string	            -	Только для ВИП (РЖД, ФПК). Обсуждается с клиентом (есть выбор).
    Регион принадлежности железной дороги	trainRegion	        string	            -	Только для ВИП (РЖД, ФПК)
    Счетчик	                                counter	            string	            -	Только для ВИП (РЖД, ФПК)
    Код точки продаж	                    salesCode	        string	            -	Код точки продаж
*/

    /*
    ШАГ 1 - Проверка Request.Body на обязательность. ошибка
            400/Bad Request, Текст: Имя обязательного параметра <значение> не заполнено.
    Шаг 2 - Проверка таблицы ПР на дубли.
            Статус: 400/Bad Request, Текст: Параметр registryTypeCode тип регистра <значение_кода> уже существует для ЭП с ИД  <значение_ИД_ЭП>
    ШАГ 3 - Найти Request.Body.registryTypeCode в tpp_ref_product_register_type.value
            Статус: 404/Not found, Текст: Код Продукта <значение> не найдено в Каталоге продуктов <схема.имя таблицы БД> для данного типа Регистра

    Шаг 4 - выбор номера счёта
    Найти значение номера счета по параметрам
    branchCode,
    currencyCode,
    mdmCode,
    priorityCode,
    registryTypeCode
    из Request.Body в таблице Пулов счетов (account_pool). Номер счета берется первый из пула

    Шаг 5 - Сформировать новый продуктовый регистр и записать его в БД
*/


}


