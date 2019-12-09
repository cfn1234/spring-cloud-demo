package com.example.serviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cfn
 */
@SpringBootApplication
@RestController
public class ServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApiApplication.class, args);
    }

}
