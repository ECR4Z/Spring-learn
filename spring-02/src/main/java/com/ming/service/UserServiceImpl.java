package com.ming.service;

import com.ming.dao.UserDao;
import com.ming.dao.UserDaoJavaImpl;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        //在此处传入userDao
        this.userDao = userDao;
    }

    @Override
    public void getUserName() {
        userDao.getUserName();
    }
}
