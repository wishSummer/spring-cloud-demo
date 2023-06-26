//package com.summer.config;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.config.environment.Environment;
//import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.RoundRobinLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Description:
// *
// * @author < a href="mailto:muwh@hzwesoft.com">muwh</ a>
// * @version $ Id: LoadBalancerConfig.java, 2023/6/26 14:38 $
// */
//@Configuration
//public class LoadBalancerConfig {
//
//
//        // 参考 NacosLoadBalancerClientConfiguration
//        @Bean
//        public ReactorLoadBalancer<ServiceInstance> roundRobinLoadBalancer(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory) {
////            String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
////            String name = environment.getName();
//
//            return new RoundRobinLoadBalancer(loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class), name);
//        }
//
//    }
//
//}
