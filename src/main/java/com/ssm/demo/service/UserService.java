package com.ssm.demo.service;

import com.ssm.demo.bean.UserBean;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    UserBean loginIn(String name, String password);
}
