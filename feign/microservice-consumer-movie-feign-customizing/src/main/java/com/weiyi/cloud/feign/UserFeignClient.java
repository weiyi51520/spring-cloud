package com.weiyi.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.weiyi.cloud.entity.User;
import com.weiyi.config.Configuration1;

import feign.Param;
import feign.RequestLine;

@FeignClient(name="microservice-provider-user",configuration=Configuration1.class)//使用feign原生注解配置请求
public interface UserFeignClient {
	
	//@RequestMapping(value="/simple/{id}",method=RequestMethod.GET)
	@RequestLine("GET /simple/{id}") //使用feign原生注解配置请求,springmvc配置注解不能使用
	public User findById(@Param("id")Long id); 
}
