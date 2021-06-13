package com.jitunayak.liquibase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class LiquibaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseDemoApplication.class, args);
    }

}
