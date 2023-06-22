package com.example.demo.account;

import com.example.demo.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Example of a JsonTest.
 */
@RunWith(SpringRunner.class)
@JsonTest
public class UserTests {
    private User user;
    @Autowired
    private JacksonTester<User> json;

    @Before
    public void setup() throws Exception {
        this.user = new User("user", "Jack", "Frost", "jfrost@example.com");
    }

    @Test
    public void deserializeJson() throws Exception {
        String content = "{\"username\": \"user\","
                + " \"firstName\": \"Jack\","
                + " \"lastName\": \"Frost\","
                + " \"email\": \"jfrost@example.com\""
                + "}";

        assertThat(this.json.parse(content)).isEqualTo(new User("user", "Jack", "Frost", "jfrost@example.com"));
        assertThat(this.json.parseObject(content).getUsername()).isEqualTo("user");
    }
}
