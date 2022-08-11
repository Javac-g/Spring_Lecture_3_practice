package com.company.v3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service(value = "Service_Three_B")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_Three_B {
    private String one;

    @Autowired
    public Service_Three_B(@Value("${prop.s3b}") String one){
        this.one = one;
    }
}
