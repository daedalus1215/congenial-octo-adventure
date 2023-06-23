package com.example.demo.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
public class Account {
    private final String user;
    private final AccountNumber accountNumber;

    public Account(String user, AccountNumber accountNumber, String user1, AccountNumber accountNumber1) {
        this.user = user1;
        this.accountNumber = accountNumber1;
    }

    private Account(Builder builder) {
        user = builder.user;
        accountNumber = builder.accountNumber;
    }

    public static Builder newBuilder() {
        return new Builder("user",
                AccountNumber.builder().build()
        );
    }


    public static final class Builder {
        private String user;
        private AccountNumber accountNumber;

        public Builder(String user, AccountNumber accountNumber) {
            this.user = user;
            this.accountNumber = accountNumber;
        }

        public Account build() {
            return new Account(this);
        }

        public Builder withUser(String user) {
            this.user = user;
            return this;
        }

        public Builder withAccountNumber(AccountNumber accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }
    }
}
