package com.example.flakyservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class FlakyServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlakyServicesApplication.class, args);
    }
}
