package com.untiled.dao.impl;

import com.untiled.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void saveAccount(){
        System.out.println("模拟保存账户..........");
    }
    public void save(){
        System.out.println(123);
    }
}
