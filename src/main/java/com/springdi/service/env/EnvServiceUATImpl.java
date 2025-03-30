package com.springdi.service.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvServiceUATImpl implements EnvService {
    @Override
    public String getDataSource() {
        return "UAT data source";
    }
}
