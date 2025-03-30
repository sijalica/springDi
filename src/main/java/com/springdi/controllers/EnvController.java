package com.springdi.controllers;

import com.springdi.service.env.EnvService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvController {
    private final EnvService envService;

    public EnvController(EnvService envService) {
        this.envService = envService;
    }

    public String getEnvDataSource() {
        return envService.getDataSource();
    }
}
