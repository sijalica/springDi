package com.springdi.controllers;

import com.springdi.service.GreetingsService;
import com.springdi.service.GreetingsServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingsService greetingsService;

    public MyController() {
        this.greetingsService = new GreetingsServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingsService.greet();
    }
}
