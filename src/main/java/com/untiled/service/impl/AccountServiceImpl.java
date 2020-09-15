package com.untiled.service.impl;

import com.untiled.dao.AccountDao;
import com.untiled.dao.impl.AccountDaoImpl;
import com.untiled.service.AccountService;
import com.untiled.utils.BeanFactory;

/**
 * @author DELL
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao=new AccountDaoImpl();
   // private AccountDao accountDao= (AccountDao) BeanFactory.getBean("AccountDao");
    @Override
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
