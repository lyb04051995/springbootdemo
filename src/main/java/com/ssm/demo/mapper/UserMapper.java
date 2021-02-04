package com.ssm.demo.mapper;

import com.ssm.demo.bean.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    //根据账号和密码验证是否存在
    UserBean getInfo(String account, String password);

    //根据账号判段该账号是否存在
    UserBean getInfobyaccount(String account);

    //注册
    int insertUser(String name,String account,String password,String email);
}
