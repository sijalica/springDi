package com.springdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimaryImpl implements GreetingsService {
    @Override
    public String greet() {
        return "Hello From the Primary Bean!!";
    }
}
