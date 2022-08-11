package com.company.v4.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Service_Four_B {
    @Value("${prop.s4b}")
    private String one;

    public String getOne(){
        return one;
    }
}
