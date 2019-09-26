package com.manage.snowflake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SnowflakeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnowflakeServiceApplication.class, args);
    }

}
