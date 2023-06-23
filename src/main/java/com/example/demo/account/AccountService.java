package com.example.demo.account;

import java.util.Collections;
import java.util.List;

public class AccountService {
    private final UserService userService;
    private final AccountRepository accountRepository;

    public AccountService(UserService userService, AccountRepository accountRepository) {
        this.userService = userService;
        this.accountRepository = accountRepository;
    }


    public List<Account> getUserAccounts() {
        return Collections.singletonList(Account.builder()
                .build());
    }
}
