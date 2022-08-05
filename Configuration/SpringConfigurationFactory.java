package com.company.Configuration;

import com.company.v1.Controllers.Controller;
import com.company.v1.Services.Service_One_A;
import com.company.v1.Services.Service_One_B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigurationFactory {


    //////////////////////////////////// - B -  E  -  A -  N -  S  - ////////////////////////////////////

    @Bean("Service_One_A")
    public Service_One_A service_one_a(){
        return new Service_One_A();
    }
    @Bean("Service_One_B")
    public Service_One_B service_one_b(){
        return new Service_One_B();
    }

    //////////////////////////////////// -  C O N T R O L L E R S -////////////////////////////////////
    @Bean("Controller")
    public Controller controller(){
        Controller controller = new Controller(service_one_a(),service_one_b());
        return controller;
    }




}
