  package com.myapp.zipkintrace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RequestMapping("/hello")
@RestController
public class HelloController {

	@Autowired
	private WebClient webClient;
	
	@RequestMapping("/trace")
    public String onlyTrace() {
        System.out.println("===call trace-a===");
        return "trace";
    }

	@RequestMapping("/trace-a")
    public Mono<String> trace() {
        System.out.println("===call trace-a===");
        return webClient.get().uri("/hello/trace").retrieve().bodyToMono(String.class);
    }

}