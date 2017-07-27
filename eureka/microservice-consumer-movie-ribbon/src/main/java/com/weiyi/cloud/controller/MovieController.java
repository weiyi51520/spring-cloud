package com.weiyi.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weiyi.cloud.entity.User;
@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemple;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	//读取的是yml文件中配置的值,这种固定配置的ip port不易于现在流行的动态环境中进行配置
	@Value("${user.userServicePath}") 
	private String userServicePath;		
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id")Long id){
		//原来地址 http://127.0.0.1:7900/simple/
		//VIP virtual IP
		//HAProxy Heartbeat 这里是服务提供者的spring.application.name
		return this.restTemple.getForObject("http://microservice-provider-user/simple/"+id, User.class);
	}
	
	@GetMapping("/test")
	public String test(){
		ServiceInstance instance =  this.loadBalancerClient.choose("microservice-provider-user");
		System.out.println("111:"+instance.getServiceId()+":"+instance.getHost()+":"+instance.getPort());
		
		ServiceInstance instance2 =  this.loadBalancerClient.choose("microservice-provider-user2");
		System.out.println("222:"+instance2.getServiceId()+":"+instance2.getHost()+":"+instance2.getPort());
		return "1";
	}
	
	/*public User findById(@PathVariable("id")Long id){
		return this.restTemple.getForObject(userServicePath+id, User.class);
	}*/
	
}
