package com.springdi.controllers;

import com.springdi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingsService greetingService;

    public String sayHello(){
        return greetingService.greet();
    }
}
