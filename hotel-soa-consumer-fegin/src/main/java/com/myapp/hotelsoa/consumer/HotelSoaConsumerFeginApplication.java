package com.myapp.hotelsoa.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class HotelSoaConsumerFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelSoaConsumerFeginApplication.class, args);
	}
}
