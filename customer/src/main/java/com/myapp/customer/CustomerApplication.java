package com.myapp.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableFeignClients(
        basePackages = "com.myapp.clients"
)
@SpringBootApplication(
        scanBasePackages = {
                "com.myapp.customer",
                "com.myapp.amqp"
        }
)
public class CustomerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class,args);

    }
}
