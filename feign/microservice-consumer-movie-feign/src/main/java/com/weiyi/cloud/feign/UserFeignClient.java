package com.weiyi.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.weiyi.cloud.entity.User;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {

	@RequestMapping(value="/simple/{id}",method=RequestMethod.GET)
	public User findById(@PathVariable("id")Long id); //两个坑 GetMapping不支持 PathVariable得设置value
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public  User postUser(@RequestBody User user);
	
	@RequestMapping(value="/get-user",method=RequestMethod.GET)
	public  User getUser//这样请求才能成功发起get请求
	(@RequestParam("id") Long id,@RequestParam("username")String username,@RequestParam("name")String name);
	//public  User getUser(User user); //坑 参数为对象时,即使method=RequestMethod.GET feign默认还是使用post请求
}
