package com.myapp.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		//访问地址 http://localhost:7010/hystrix 
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}
}
