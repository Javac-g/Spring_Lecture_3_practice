package com.company.v5.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Five_A {
    @Value("${prop.s5a}")
    private String one;

    public String getOne() {
        return one;
    }
}
