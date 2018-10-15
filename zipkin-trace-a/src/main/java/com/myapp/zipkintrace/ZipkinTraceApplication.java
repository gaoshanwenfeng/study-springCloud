package com.myapp.zipkintrace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ZipkinTraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinTraceApplication.class, args);
	}
	
    @Autowired
    private LoadBalancerExchangeFilterFunction lbFunction;
	
    @Bean
    public WebClient webClient() {
        return WebClient.builder().baseUrl("http://zipkintrace-b").filter(lbFunction).build();
    }
}
