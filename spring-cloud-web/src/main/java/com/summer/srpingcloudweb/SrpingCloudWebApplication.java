package com.summer.srpingcloudweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDiscoveryClient
public class SrpingCloudWebApplication {

    public static void main(String[] args) throws InterruptedException {
//        SpringApplication.run(SrpingCloudWebApplication.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SrpingCloudWebApplication.class, args);
        while(true){
            String name = applicationContext.getEnvironment().getProperty("name");
            String age = applicationContext.getEnvironment().getProperty("age");

            System.err.println("name :" + name);
            System.err.println("age :" + age);
            Thread.sleep(5);
        }



    }
}

