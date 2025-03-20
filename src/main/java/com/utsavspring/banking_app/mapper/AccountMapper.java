package com.utsavspring.banking_app.mapper;

import com.utsavspring.banking_app.dto.AccountDto;
import com.utsavspring.banking_app.entity.Account;

import java.util.Locale;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
        return account;
    }
    public static AccountDto maptoAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}

