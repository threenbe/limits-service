package com.javatpoint.microservices.limitsservice;

import com.javatpoint.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    //@Autowired is the main annotation behind dependency injection.
    //It allows Spring to resolve and inject collaborating beans into this bean.
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMax(), configuration.getMin());
    }
}
