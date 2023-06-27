package com.example.demo.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AccountNumber {
    @Id
    private Long id;

    private String number;

    private AccountNumber(Builder builder) {
        number = builder.number;
    }

    public String getNumber() {
        return number;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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
