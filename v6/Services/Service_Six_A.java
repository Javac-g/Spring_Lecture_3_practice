package com.company.v6.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Six_A {
    @Value("${prop.s6a}")
    private String one;

    public String getOne() {
        return one;
    }
}
