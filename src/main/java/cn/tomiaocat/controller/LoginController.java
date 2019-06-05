package cn.tomiaocat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/registration")
public class LoginController {
    @RequestMapping(value = "/toRegistration")
    public String toRegistration() {
        return "my_blog/registration";
    }
    
    @RequestMapping(value = "/toLogin")
    public String toLogin() {
        return "my_blog/login";
    }
    @RequestMapping(value = "/loginForm")
    public String loginForm() {
        return "my_blog/login";
    }
}
