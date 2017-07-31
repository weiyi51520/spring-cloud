package com.weiyi.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weiyi.config.Configuration2;

@FeignClient(name="microservice-provider-user",url="http://127.0.0.1:8761",configuration=Configuration2.class)//这样配置可以使用springmvc的注解
public interface FeignClient2 {
	
	@RequestMapping(method=RequestMethod.GET,value="/eureka/apps/{serviceName}")//这样配置可以使用springmvc的注解
	public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
