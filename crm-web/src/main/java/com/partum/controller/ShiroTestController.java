package com.partum.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShiroTestController {


    @RequestMapping("/shiro/login")
    public String login(@RequestParam("username")String username, @RequestParam("password") String password){
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
//            token.setRememberMe(true);
            try {
                System.out.println("1. "+token.hashCode());
                currentUser.login(token);
            }catch (AuthenticationException ae) {
//                ae.printStackTrace();
                System.out.println("登录失败  "+ae.getMessage());
            }

        }
        return "redirect:/list.jsp";
    }
}
