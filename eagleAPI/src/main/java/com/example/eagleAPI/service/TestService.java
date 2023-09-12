package com.example.eagleAPI.service;

import com.example.eagleAPI.data.AccountName;
import com.example.eagleAPI.data.Passphrases;
import com.example.eagleAPI.infra.JdbcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private JdbcTest ds;

    @Autowired
    public TestService(JdbcTest ds) {
        this.ds = ds;
    }

    public Passphrases find(AccountName accountName){
        Passphrases passphrases = ds.findTest(accountName);
        return  passphrases;
    }

}
