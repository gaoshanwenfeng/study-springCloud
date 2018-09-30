package com.myapp.hotelsoa.consumer.remote;

import java.util.Date;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 创建一个 Feign 的客户端接口定义。
 * 使用@FeignClient注解来指定这个接口所要调用的服务名称，接口中定义的各个函数使用 Spring MVC 的注解就可以来绑定服务提供方的 REST 接口，
 * 比如下面就是绑定 hotel-soa-provider 服务的 /hello/name接口的例子
 * 
 * 此类中的方法和远程服务中 Contoller 中的方法名和参数需保持一致
 * @author gaofeng
 *
 */
@FeignClient(name = "hotel-soa-provider")
@Component
public interface ProxyHotelRemote {
	
    @RequestMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
    
}
