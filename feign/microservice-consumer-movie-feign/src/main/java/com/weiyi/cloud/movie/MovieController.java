package com.weiyi.cloud.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weiyi.cloud.entity.User;
import com.weiyi.cloud.feign.UserFeignClient;
@RestController
public class MovieController {
	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id")Long id){
		return userFeignClient.findById(id);
	}
	
	@GetMapping("/test")
	public User testPost(User user){
		return this.userFeignClient.postUser(user);
	}
	
	@GetMapping("/test-get")
	public User testGet(User user){
		return this.userFeignClient.getUser(user.getId(),user.getUsername(),user.getName());
	}
}
