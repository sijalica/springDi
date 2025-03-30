package com.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("QA")
@SpringBootTest
class EnvControllerTest {
    @Autowired
    EnvController controller;

    @Test
    void testDevEnvironment() {
        System.out.println(controller.getEnvDataSource());
    }
}