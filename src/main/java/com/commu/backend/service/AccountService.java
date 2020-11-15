package com.commu.backend.service;

import com.commu.backend.repository.community.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AccountService {

    public AccountRepository accountRepository;

    public AccountService(AccountRepository repository) {
        this.accountRepository = repository;
    }

    public boolean login(String id, String pw) {
        accountRepository.findFirstByAccountAndPassword(id, pw).orElseThrow(NoSuchElementException::new);
        return true;
    }
}
