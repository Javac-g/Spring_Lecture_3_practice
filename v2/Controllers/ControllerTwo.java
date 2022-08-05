package com.company.v2.Controllers;

import com.company.v2.Services.Service_Two_A;
import com.company.v2.Services.Service_Two_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Two")
public class ControllerTwo {

    private static final Logger logger = LoggerFactory.getLogger(ControllerTwo.class);

    private Service_Two_A service_two_a;
    private Service_Two_B service_two_b;

    public void setService_two_a(Service_Two_A service_two_a) {
        this.service_two_a = service_two_a;
    }

    public void setService_two_b(Service_Two_B service_two_b) {
        this.service_two_b = service_two_b;
    }
    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("http://192.168.0.104:8090/Two/S");
        logger.info("A: " + service_two_a);
        logger.info("B: " + service_two_b);
        return "\n" + service_two_a.getOne() + "\n" + service_two_b.getOne();
    }
}
