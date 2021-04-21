package com.irn.coffeeapp;

import com.irn.coffeeapp.config.Droid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;
import java.util.UUID;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CoffeeAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(CoffeeAppApplication.class, args
        );
    }
    @Bean
    @ConfigurationProperties(prefix = "droid")
    Droid createDroid() {
        return new Droid();
    }

}



