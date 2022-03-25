package com.javatpoint.microservices.limitsservice.bean;

public class LimitConfiguration {
    private int max;
    private int min;

    public LimitConfiguration(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
