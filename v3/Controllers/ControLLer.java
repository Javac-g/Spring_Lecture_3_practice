package com.company.v3.Controllers;


import com.company.v3.Services.Service_Three_A;
import com.company.v3.Services.Service_Three_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Three")
public class ControLLer {


    @Autowired
    private Service_Three_A service_three_a;
    @Autowired
    private Service_Three_B service_three_b;

    private static final Logger logger = LoggerFactory.getLogger(ControLLer.class);

    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    public String server(){
        logger.info("https://192.168.0.104:8080/Three/S");
        logger.info("A: " + service_three_a);
        logger.info("B: " + service_three_b);
        return "\n" + service_three_a.getOne() + "\n" + service_three_b.getOne();
    }



}
