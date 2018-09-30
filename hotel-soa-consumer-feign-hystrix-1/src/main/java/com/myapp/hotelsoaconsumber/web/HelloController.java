package com.myapp.hotelsoaconsumber.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.hotelsoaconsumber.remote.ProxyHytrixHotelSoaRemote;

@RequestMapping("/hello")
@RestController
public class HelloController {


	@Autowired
	ProxyHytrixHotelSoaRemote proxyHytrixHotelSoaRemote;

    @GetMapping("/hytrix/say")
    public String hytrixhello(@RequestParam String name) {
    	name += "!!!!";
//    	return "Hello! Fallback...";
        return proxyHytrixHotelSoaRemote.hello(name);
    }

}