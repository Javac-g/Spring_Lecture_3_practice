package com.company.v1.Controllers;

import com.company.v1.Services.Service_One_A;
import com.company.v1.Services.Service_One_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/One")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private Service_One_A service_one_a;
    private Service_One_B service_one_b;

    public Controller(Service_One_A service_one_a, Service_One_B service_one_b) {
        this.service_one_a = service_one_a;
        this.service_one_b = service_one_b;
    }


    @RequestMapping(value = "/service",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104:8090/One");
        logger.info("A: " + service_one_a);
        logger.info("B: " + service_one_b);
        return "\n" + service_one_a.getOne() + "\n" + service_one_b.getOne();
    }
}
