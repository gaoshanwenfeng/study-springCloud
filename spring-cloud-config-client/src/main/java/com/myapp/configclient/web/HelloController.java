package com.myapp.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${info.profile:error}")
    private String profile;

    @GetMapping("/info")
    public String hello() {
        return profile;
    }
}
