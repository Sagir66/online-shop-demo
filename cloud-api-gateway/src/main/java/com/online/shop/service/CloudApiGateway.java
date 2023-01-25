package com.online.shop.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(CloudApiGateway.class,args);
    }
}