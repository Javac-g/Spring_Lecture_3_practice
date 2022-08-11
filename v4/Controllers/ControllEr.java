package com.company.v4.Controllers;

import com.company.v4.Services.Service_Four_A;
import com.company.v4.Services.Service_Four_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Four")
public class ControllEr {

    private final static Logger logger = LoggerFactory.getLogger(ControllEr.class);

    @Lookup
    public Service_Four_A service_four_a(){
        return null;
    }

    @Lookup
    public Service_Four_B service_four_b(){
        return null;
    }
    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104:8090/Four/S");
        logger.info("A: " + service_four_a());
        logger.info("B: " + service_four_b());
        return "\n" + service_four_a().getOne() + "\n" + service_four_b().getOne();

    }


}
