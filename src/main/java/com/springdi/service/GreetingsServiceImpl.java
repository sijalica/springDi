package com.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String greet() {
        return "Greetings";
    }
}
