package com.rubik.springoauth2;

import com.rubik.springoauth2.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2Application.class, args);
    }
}