package com.company.v2.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Two_A {
    @Value("${prop.s2a}")
    private String one;

    public String getOne() {
        return one;
    }
}
