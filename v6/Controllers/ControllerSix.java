package com.company.v6.Controllers;

import com.company.v6.Services.Service_Six_A;
import com.company.v6.Services.Service_Six_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Six")
public class ControllerSix {

    private static final Logger logger = LoggerFactory.getLogger(ControllerSix.class);
    private Service_Six_A service_six_a;
    private Service_Six_B service_six_b;

    public ControllerSix(Service_Six_A service_six_a, Service_Six_B service_six_b) {
        this.service_six_a = service_six_a;
        this.service_six_b = service_six_b;
    }


    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("http://192.168.0.104/Six/S");
        logger.info("A: " + service_six_a);
        logger.info("B: " + service_six_b);
        return "\n" + service_six_a.getOne() + "\n" + service_six_b.getOne();

    }
}
