package com.ssm.demo.serviceimpl;

import com.ssm.demo.bean.UserBean;
import com.ssm.demo.mapper.UserMapper;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String account, String password) {
        return userMapper.getInfo(account,password);
    }

    @Override
    public UserBean getInfobyaccount(String account) {
        return userMapper.getInfobyaccount(account);
    }

    @Override
    public int insertUser(String name, String account, String password, String email) {
        return userMapper.insertUser(name,account,password,email);
    }

}
