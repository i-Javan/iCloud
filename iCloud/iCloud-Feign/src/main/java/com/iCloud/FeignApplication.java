package com.iCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients //@EnableFeignClients注解开启Feign的功能
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run( FeignApplication.class, args );
    }

    @FeignClient(value = "service-hi")
    public interface SchedualServiceHi {
        @RequestMapping(value = "/hi", method = RequestMethod.GET)
        String sayHiFromClientOne(@RequestParam(value = "name") String name);
    }
}



