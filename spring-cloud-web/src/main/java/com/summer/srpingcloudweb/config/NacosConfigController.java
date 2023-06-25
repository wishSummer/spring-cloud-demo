//package com.summer.srpingcloudweb.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Description:
// *
// * @author < a href="mailto:muwh@hzwesoft.com">muwh</ a>
// * @version $ Id: NacosConfigController.java, 2023/6/25 14:32 $
// */
//
//@RestController
//@RequestMapping("/config")
//@RefreshScope
//public class NacosConfigController {
//
//    @Value("${useLocalCache:false}")
//    private boolean useLocalCache;
//
//    @Value("${user.name:1}")
//    private String name;
//
//    @Value("${user.age:2}")
//    private String age;
//
//    @RequestMapping("/get")
//    public boolean get() {
//        return useLocalCache;
//    }
//
//    @RequestMapping("/user")
//    public String use(){
//        return name+age;
//    }
//
//}
