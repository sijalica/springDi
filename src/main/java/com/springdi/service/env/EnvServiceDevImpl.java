package com.springdi.service.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class EnvServiceDevImpl implements EnvService {
    @Override
    public String getDataSource() {
        return "dev data source";
    }
}
