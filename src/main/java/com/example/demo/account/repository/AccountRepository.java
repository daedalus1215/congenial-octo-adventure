package com.example.demo.account.repository;

import com.example.demo.account.entity.account.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
}
