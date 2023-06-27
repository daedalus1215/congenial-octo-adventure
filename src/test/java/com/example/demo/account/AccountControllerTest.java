//package com.example.demo.account;
//
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.util.List;
//
//import static java.util.Collections.singletonList;
//import static org.mockito.BDDMockito.given;
//import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(AccountController.class)
//public class AccountControllerTest {
//
//    @Autowired
//    private WebApplicationContext context;
//
//    private MockMvc mvc;
//
//    @MockBean
//    private AccountService accountService;
//
//    @BeforeEach
//    public void setup() {
//        this.mvc = MockMvcBuilders
//                .webAppContextSetup(this.context)
//                .apply(springSecurity())
//                .build();
//    }
//
//    @Test
//    public void getUserAccountsSsourhouldReturnAccounts() throws Exception {
//        final String content = "{\"username\": \"user\", \"accountNumber\": \"123456789\"}";
//        final List<Account> user = singletonList(new Account(1, "d"));
//
//        given(this.accountService.getUserAccounts())
//                .willReturn(user);
//
//        mvc.perform(MockMvcRequestBuilders.get("/v1/accounts"))
//                .andExpect(status().isOk())
//                .andExpect(content().json(content));
//    }
//}
