package com.company.v2.Controllers;

import com.company.v2.Services.Service_Two_A;
import com.company.v2.Services.Service_Two_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Two")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    private Service_Two_A service_two_a;
    private Service_Two_B service_two_b;

    public void setService_two_a(Service_Two_A service_two_a) {
        this.service_two_a = service_two_a;
    }

    public void setService_two_b(Service_Two_B service_two_b) {
        this.service_two_b = service_two_b;
    }
}
