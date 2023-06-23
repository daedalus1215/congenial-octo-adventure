package com.example.demo.account;

public class AccountService {
    private final UserService userService;
    private final AccountRepository accountRepository;

    public AccountService(UserService userService, AccountRepository accountRepository) {
        this.userService = userService;
        this.accountRepository = accountRepository;
    }


    public Account getUserAccounts() {
        return Account.builder()
                .build();
    }
}
