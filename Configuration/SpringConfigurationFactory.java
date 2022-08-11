package com.company.Configuration;

import com.company.v1.Controllers.Controller;
import com.company.v1.Services.Service_One_A;
import com.company.v1.Services.Service_One_B;
import com.company.v2.Controllers.ControllerTwo;
import com.company.v2.Services.Service_Two_A;
import com.company.v2.Services.Service_Two_B;
import com.company.v5.Controllers.ControllerFive;
import com.company.v5.Services.Service_Five_A;
import com.company.v5.Services.Service_Five_B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigurationFactory {


    //////////////////////////////////// - B -  E  -  A -  N -  S  - ////////////////////////////////////

    @Bean("Service_One_A")
    @Scope(value = "prototype")
    public Service_One_A service_one_a(){
        return new Service_One_A();
    }
    @Bean("Service_One_B")
    @Scope(value = "prototype")
    public Service_One_B service_one_b(){
        return new Service_One_B();
    }
    @Bean("Service_Two_A")
    @Scope(value = "prototype")
    public Service_Two_A service_two_a(){
        return new Service_Two_A();
    }
    @Bean("Service_Two_B")
    @Scope(value = "prototype")
    public Service_Two_B service_two_b(){
        return new Service_Two_B();
    }
    @Bean("Service_Five_A")
    @Scope("prototype")
    public Service_Five_A service_five_aBean(){
        return new Service_Five_A();
    }
    @Bean
    @Scope("prototype")
    public Service_Five_B service_five_bBean(){
        return new Service_Five_B();
    }

    //////////////////////////////////// -  C O N T R O L L E R S -////////////////////////////////////
    @Bean("Controller")
    @Scope(value = "prototype")
    public Controller controller(){
        return new Controller(service_one_a(),service_one_b());


    }
    @Bean("ControllerTwo")
    @Scope(value = "prototype")
    public ControllerTwo controllerTwo(){
        ControllerTwo controllerTwo = new ControllerTwo();
        controllerTwo.setService_two_a(service_two_a());
        controllerTwo.setService_two_b(service_two_b());
        return controllerTwo;
    }
    @Bean("ControllerFive")
    public ControllerFive controllerFive(){
        ControllerFive controllerFive = new ControllerFive(){
            @Override
            protected Service_Five_A service_five_a() {
                return service_five_aBean();
            }

            @Override
            protected Service_Five_B service_five_b() {
                return service_five_bBean();
            }
        };
        return controllerFive;
    }



}
