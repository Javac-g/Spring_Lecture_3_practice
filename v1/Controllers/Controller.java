package com.company.v1.Controllers;

import com.company.v1.Services.Service_One_A;
import com.company.v1.Services.Service_One_B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/One")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private Service_One_A service_one_a;
    private Service_One_B service_one_b;

    public Controller(Service_One_A service_one_a, Service_One_B service_one_b) {
        this.service_one_a = service_one_a;
        this.service_one_b = service_one_b;
    }

    public void setService_one_a(Service_One_A service_one_a) {
        this.service_one_a = service_one_a;
    }

    public void setService_one_b(Service_One_B service_one_b) {
        this.service_one_b = service_one_b;
    }
}
