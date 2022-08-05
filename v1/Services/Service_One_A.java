package com.company.v1.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_One_A {
    @Value("${prop.s1a}")
    private String one;

    public String getOne(){
        return one;
    }
}
