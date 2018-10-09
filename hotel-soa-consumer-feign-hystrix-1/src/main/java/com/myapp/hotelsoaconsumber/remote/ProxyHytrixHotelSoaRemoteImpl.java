package com.myapp.hotelsoaconsumber.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ProxyHytrixHotelSoaRemoteImpl implements ProxyHytrixHotelSoaRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name){
		return name + "Hello! Fallback>>>";
	}

}
