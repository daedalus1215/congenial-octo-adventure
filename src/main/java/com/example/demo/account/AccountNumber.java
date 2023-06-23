package com.example.demo.account;

import lombok.Builder;

@Builder
public class AccountNumber {
    private final String number;

    public AccountNumber(String number) {
        this.number = number;
    }

    private AccountNumber(Builder builder) {
        number = builder.number;
    }

    public String getNumber() {
        return number;
    }


    public static final class Builder {
        private final String number;

        public Builder(String number) {
            this.number = number;
        }

        public AccountNumber build() {
            return new AccountNumber(this);
        }
    }
}
