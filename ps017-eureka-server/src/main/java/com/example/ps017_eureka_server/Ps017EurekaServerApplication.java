package com.example.ps017_eureka_server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ps017EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(
            Ps017EurekaServerApplication.class, args
        );
    }
}