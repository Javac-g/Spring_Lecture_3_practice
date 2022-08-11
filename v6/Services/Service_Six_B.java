package com.company.v6.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Six_B {
    @Value("${prop.s6b}")
    private String one;

    public String getOne() {
        return one;
    }
}
