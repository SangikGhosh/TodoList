package com.in28minutes.springboot.TodoList.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
