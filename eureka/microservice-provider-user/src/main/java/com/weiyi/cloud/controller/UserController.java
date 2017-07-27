package com.weiyi.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.weiyi.cloud.entity.User;
import com.weiyi.cloud.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	private EurekaClient eurekaClient;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}
	
	@GetMapping("/eureka-instance")
	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
		return instance.getHomePageUrl();
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance showInfo(){
		ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}
}
