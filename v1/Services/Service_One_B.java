package com.company.v1.Services;

import org.springframework.beans.factory.annotation.Value;

public class Service_One_B {
    @Value("${prop.s1b}")
    private String one;
    public String getOne(){
        return one;
    }
}
