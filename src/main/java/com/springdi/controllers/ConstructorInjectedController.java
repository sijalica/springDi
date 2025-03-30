package com.springdi.controllers;

import com.springdi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingsService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingsServiceImpl")GreetingsService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.greet();
    }
}
