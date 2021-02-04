package com.ssm.demo.controller;

import com.ssm.demo.bean.UserBean;
import com.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public  String show()
    {
        return "login";
    }

    @RequestMapping(value ="/loginIn",method = RequestMethod.POST)
    public  String login( String account,  String password)
    {
        UserBean userBean = userService.loginIn(account,password);
        if(userBean!=null){
            return "menu";
        }else {
            return "error";
        }
    }

    @RequestMapping("/User/personinfo")
    public String personinfo()
    {
        return "User/personinfo";
    }

    @RequestMapping("/User/register")
    public String UserRegister(UserBean userBean)
    {
        userService.insertUser(userBean.getName(), userBean.getAccount(), userBean.getPassword(), userBean.getEmail());
        return "success";
    }

}
