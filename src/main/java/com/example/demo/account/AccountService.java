//package com.example.demo.account;
//
//import com.example.demo.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Collections;
//import java.util.List;
//
//@Component
//public class AccountService {
//    private final UserService userService;
//    private final AccountRepository accountRepository;
//
//    @Autowired
//    public AccountService(UserService userService, AccountRepository accountRepository) {
//        this.userService = userService;
//        this.accountRepository = accountRepository;
//    }
//
//
//    public List<Account> getUserAccounts() {
//        return Collections.singletonList(new Account(1, "d"));
//    }
//}
