package com.springdi.service.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class EnvServiceProdImpl implements EnvService {
    @Override
    public String getDataSource() {
        return "Prod data source";
    }
}
