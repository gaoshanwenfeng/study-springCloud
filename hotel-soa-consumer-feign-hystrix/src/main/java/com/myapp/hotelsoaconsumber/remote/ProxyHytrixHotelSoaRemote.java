package com.myapp.hotelsoaconsumber.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hotel-soa-provider", fallback= ProxyHytrixHotelSoaRemoteImpl.class)
public interface ProxyHytrixHotelSoaRemote {
	   
	@RequestMapping("/hello/")
	String hello(@RequestParam(value = "name") String name);
	
}
