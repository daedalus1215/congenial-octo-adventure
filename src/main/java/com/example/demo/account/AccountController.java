package com.example.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class AccountController {

    @GetMapping("/v1/accounts")
    public List<Account> apply() {
        return Collections.singletonList(new Account(1, "d"));
    }
}
