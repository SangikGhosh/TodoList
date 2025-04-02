package com.in28minutes.springboot.TodoList.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller("/")
public class SayHelloController {
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello")
    public String sayHello() {
        return "sayHello";
    }
}
