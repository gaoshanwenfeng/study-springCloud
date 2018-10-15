  package com.myapp.zipkintrace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {


	@RequestMapping("/trace")
    public String trace() {
        System.out.println("===call trace-b===");
        return "trace";
    }

}