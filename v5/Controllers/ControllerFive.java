package com.company.v5.Controllers;

import com.company.v5.Services.Service_Five_A;
import com.company.v5.Services.Service_Five_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Five")
public class ControllerFive {

    private static final Logger logger = LoggerFactory.getLogger(ControllerFive.class);

    protected Service_Five_A service_five_a(){
        throw new UnsupportedOperationException();
    }

    protected Service_Five_B service_five_b(){
        throw new UnsupportedOperationException();
    }

    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104/Five/S");
        logger.info("A: " + service_five_a());
        logger.info("B: " + service_five_b());
        return "\n" + service_five_a().getOne() + "\n" + service_five_b().getOne();
    }
}
