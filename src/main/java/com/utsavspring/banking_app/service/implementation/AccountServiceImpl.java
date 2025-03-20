package com.utsavspring.banking_app.service.implementation;

import com.utsavspring.banking_app.dto.AccountDto;
import com.utsavspring.banking_app.entity.Account;
import com.utsavspring.banking_app.exception.AccountException;
import com.utsavspring.banking_app.mapper.AccountMapper;
import com.utsavspring.banking_app.repository.AccountRepository;
import com.utsavspring.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.maptoAccount(accountDto);
        Account SavedAccount=accountRepository.save(account);
        return AccountMapper.maptoAccountDto(SavedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account=accountRepository.findById(id).orElseThrow(()->new AccountException("Account does not exists"));
        return AccountMapper.maptoAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account=accountRepository.findById(id).orElseThrow(()->new AccountException("Account does not exists"));
        double total=account.getBalance()+amount;
        account.setBalance(total);
        Account savedAccount=accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account=accountRepository.findById(id).orElseThrow(()->new AccountException("Account does not exists"));
       if(account.getBalance()<amount){
           throw new RuntimeException("Account balance does not enough");
       }
       double total =account.getBalance()-amount;
       account.setBalance(total);
       Account savedAccount=accountRepository.save(account);
       return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account>accounts=accountRepository.findAll();
        return accounts.stream().map(AccountMapper::maptoAccountDto).collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long id, String name) {
        // Fetch the account by ID
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new AccountException("Account does not exist"));

        // ✅ Check if the account holder name matches
        if (!account.getAccountHolderName().equalsIgnoreCase(name)) {
            throw new AccountException("Account holder name does not match the given ID!");
        }
        // ✅ Now delete the account
        accountRepository.deleteById(id);
    }

}
