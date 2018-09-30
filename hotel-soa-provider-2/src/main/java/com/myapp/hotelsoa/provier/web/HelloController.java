package com.myapp.hotelsoa.provier.web;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/")
    public String hello(@RequestParam String name) {
        return "[2]Hello, " + name + " " + new Date();
    }

}