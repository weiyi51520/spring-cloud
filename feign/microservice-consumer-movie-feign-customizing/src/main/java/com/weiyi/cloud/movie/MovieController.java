package com.weiyi.cloud.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weiyi.cloud.entity.User;
import com.weiyi.cloud.feign.FeignClient2;
import com.weiyi.cloud.feign.UserFeignClient;
@RestController
public class MovieController {
	@Autowired
	private UserFeignClient userFeignClient;
	@Autowired
	private FeignClient2 FeignClient2;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id")Long id){
		return userFeignClient.findById(id);
	}
	
	@GetMapping("/{serviceName}")
	public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName){
		return this.FeignClient2.findServiceInfoFromEurekaByServiceName(serviceName);
	}
}
