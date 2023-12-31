package com.summer.srpingcloudweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
public class SrpingCloudWebApplication {

    public static void main(String[] args){
        SpringApplication.run(SrpingCloudWebApplication.class, args);
    }

    @RestController
    class ProviderController{
        @Value("${server.port}")
        private String port;

        @GetMapping("/get/{string}")
        public String getPort(@PathVariable String string){
            return "port:"+port+"string:"+string;
        }
        @GetMapping("/test")
        public String test(){
            return "port:"+port;
        }

    }
}

