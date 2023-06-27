//package com.example.demo.account;
//
//import com.example.demo.user.UserService;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Collections;
//import java.util.Optional;
//
//import static org.mockito.BDDMockito.given;
//
///**
// * Example of MockBean for integration tests.
// */
//@RunWith(SpringRunner.class)
//public class AccountServiceTests {
//    @MockBean
//    private UserService userService;
//    @MockBean
//    private AccountRepository accountRepository;
//    private AccountService accountService;
//
//    @Before
//    public void before() {
//        accountService = new AccountService(userService, accountRepository);
//    }
//
//    @Test
//    public void getUserAccountsReturnsSingleAccount() throws Exception {
//        given(this.accountRepository.findById(1))
//                .willReturn(Optional.of(new Account(1, "d")));
//    }
//}
