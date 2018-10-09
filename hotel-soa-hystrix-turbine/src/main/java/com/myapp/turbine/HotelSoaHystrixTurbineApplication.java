package com.myapp.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@SpringBootApplication
@EnableHystrixDashboard
public class HotelSoaHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSoaHystrixTurbineApplication.class, args);
	}
}
