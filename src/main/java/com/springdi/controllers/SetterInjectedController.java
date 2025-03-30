package com.springdi.controllers;

import com.springdi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingsService greetingService;

    @Autowired
    public void setGreetingService(GreetingsService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
