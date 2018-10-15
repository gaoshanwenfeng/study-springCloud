package com.myapp.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.myapp.apigateway.fiter.PreAuthorZuulFilter;

@EnableZuulProxy
@SpringBootApplication
public class SpringCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreAuthorZuulFilter initPreAuthorZuulFilter() {
		return new PreAuthorZuulFilter();
	}
}
