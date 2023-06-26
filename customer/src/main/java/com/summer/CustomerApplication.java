package com.summer;

import com.summer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.RoundRobinLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Description:
 *
 * @author < a href="wangfc@hzwesoft.com">wangfc</ a>
 * @version $ Id: CustomerApplication.java, 2023/6/26 11:32 $
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @RestController
    class ProviderController {
//        private RestTemplate restTemplate;

//        @Autowired
//        public void setRestTemplate(RestTemplate restTemplate) {
//            this.restTemplate = restTemplate;
//        }


        private TestService testService;

        @Autowired
        public void setTestService(TestService testService) {
            this.testService = testService;
        }

        @GetMapping("/getPort/{string}")
        public String getPort(@PathVariable String string) {
//            return restTemplate.getForObject("http://provider/get/"+string,String.class);
            return testService.test(string);
        }

        @GetMapping("/get/{string}")
        public String get(@PathVariable String string) {
//            return restTemplate.getForObject("http://provider/get/"+string,String.class);
            return testService.getPort(string);
        }


        @GetMapping("test")
        public String test(){
            return testService.tes();
        }
    }
}

