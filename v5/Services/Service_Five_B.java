package com.company.v5.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Five_B {
    @Value("${prop.s5b}")
    private String one;

    public String getOne() {
        return one;
    }
}
