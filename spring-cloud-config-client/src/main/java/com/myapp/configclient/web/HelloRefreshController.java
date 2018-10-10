package com.myapp.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloRefreshController {
	
	@Value("${info.profile:error}")
    private String profile;

    @GetMapping("/showinfo")
    public String hello() {
        return profile;
    }
}
