package com.myapp.notification;

import com.myapp.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "com.myapp.notification",
                "com.myapp.amqp"
        }
)
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);


    }
    //test for rabbitMQ
    /*@Bean
    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer,
                                        NotificationConfig notificationConfig){
        return args -> {
            producer.publish(new Person("Annabelle",27),notificationConfig.getInternalExchange(),notificationConfig.getInternalNotificationRoutingKey());
        };
    }

    record Person(String name, int age){}*/
}
