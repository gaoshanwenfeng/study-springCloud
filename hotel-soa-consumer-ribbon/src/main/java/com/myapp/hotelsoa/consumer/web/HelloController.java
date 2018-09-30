package com.myapp.hotelsoa.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/hello")
@RestController
public class HelloController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/say")
    public String hello(@RequestParam String name) {
        name += "!!";
        String url = "http://hotel-soa-provider/hello/?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}