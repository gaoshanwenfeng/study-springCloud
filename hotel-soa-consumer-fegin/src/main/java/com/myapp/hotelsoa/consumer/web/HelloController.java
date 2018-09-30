package com.myapp.hotelsoa.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.myapp.hotelsoa.consumer.remote.ProxyHotelRemote;

@RequestMapping("/hello")
@RestController
public class HelloController {

	@Autowired
	ProxyHotelRemote ProxyHotelRemote;


    @GetMapping("/say")
    public String hello(@RequestParam String name) {
    	name += "!!!!!";
        return ProxyHotelRemote.hello(name);
    }
    
}