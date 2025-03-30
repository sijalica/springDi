package com.springdi.service.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvServiceQAImpl implements EnvService {
    @Override
    public String getDataSource() {
        return "QA data source";
    }
}
