package com.example.demo.account;

import com.example.demo.account.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.mockito.BDDMockito.given;

/**
 * Example of MockBean for integration tests.
 */
@RunWith(SpringRunner.class)
public class AccountServiceTests {
    @MockBean
    private UserService userService;
    @MockBean
    private AccountRepository accountRepository;
    private AccountService accountService;

    @Before
    public void before() {
        accountService = new AccountService(userService, accountRepository);
    }

    @Test
    public void getUserAccountsReturnsSingleAccount() throws Exception {
        given(this.accountRepository.findAccountsByUsername("user"))
                .willReturn(Collections.singletonList(new Account("user", new AccountNumber("123435"))));
    }
}
