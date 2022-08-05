package com.company.v2.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_Two_B {
    @Value("${prop.s2b}")
    private String one;
    public String getOne(){
        return one;
    }
}
