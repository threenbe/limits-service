package com.javatpoint.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component is an annotation that allows Spring to automatically detect our custom beans (wtf is a bean).
//So, without having to write any explicit code, Spring will find classes annotated with @Component,
//instantiate them and inject any specified dependencies into them, and inject them wherever needed.
@Component
//The @ConfigurationProperties annotation maps external properties configurations into a class or bean.
@ConfigurationProperties("limits-service")
public class Configuration {
    private int min;
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
