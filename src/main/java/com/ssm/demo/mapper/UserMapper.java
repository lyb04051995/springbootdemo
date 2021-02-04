package com.ssm.demo.mapper;

import com.ssm.demo.bean.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    UserBean getInfo(String name, String password);
}
