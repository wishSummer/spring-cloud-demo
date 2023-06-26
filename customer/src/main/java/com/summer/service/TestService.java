package com.summer.service;

import jakarta.websocket.server.PathParam;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:
 *
 * @author < a href="wangfc@hzwesoft.com">wangfc</ a>
 * @version $ Id: TestService.java, 2023/6/26 15:16 $
 */
@Service
@FeignClient("provider")
public interface TestService {

    @LoadBalanced
    @GetMapping("/get/{string}")
    String test(String string);

    @LoadBalanced
    @GetMapping("/test/{string}")
    String getPort(@PathParam("string") String string);

    @LoadBalanced
    @GetMapping("/test")
    String tes();

}
