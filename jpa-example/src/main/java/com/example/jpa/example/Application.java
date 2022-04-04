package com.example.jpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.jpa.example"})
@EnableJpaRepositories(basePackages = {"com.example.jpa.example.repository"})
@EntityScan(basePackages = {"com.example.jpa.example.entity"})
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
