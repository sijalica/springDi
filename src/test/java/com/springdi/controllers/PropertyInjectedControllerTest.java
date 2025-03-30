package com.springdi.controllers;

import com.springdi.service.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

//    @BeforeEach
//    void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingsServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());

    }
}