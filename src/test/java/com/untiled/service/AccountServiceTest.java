package com.untiled.service;


import com.untiled.service.impl.AccountServiceImpl;
import org.junit.Test;

public class AccountServiceTest {

    @Test
    public void saveAccount() {
        AccountService accountService = new AccountServiceImpl();
        accountService.saveAccount();

    }
}
