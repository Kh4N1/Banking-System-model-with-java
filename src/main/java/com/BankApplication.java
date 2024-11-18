package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.model")
@EnableJpaRepositories("com.repository")
@ComponentScan(basePackages = "com") 
public class BankApplication {
    private static final Logger logger = LoggerFactory.getLogger(BankApplication.class);
    
    public static void main(String[] args) {
        logger.info("Starting Bank Application...");
        SpringApplication.run(BankApplication.class, args);
        logger.info("Bank Application started successfully!");
    }
}
