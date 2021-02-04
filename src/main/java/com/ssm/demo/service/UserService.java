package com.ssm.demo.service;

import com.ssm.demo.bean.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    //根据账号和密码验证是否存在
    UserBean loginIn(String account, String password);

    //根据账号判段该账号是否存在
    UserBean getInfobyaccount(String account);

    //注册
    int insertUser(String name,String account,String password,String email);
}
