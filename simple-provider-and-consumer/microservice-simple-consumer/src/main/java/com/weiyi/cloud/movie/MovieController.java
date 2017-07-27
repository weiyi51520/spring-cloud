package com.weiyi.cloud.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.weiyi.cloud.entity.User;
@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemple;
	
	//读取的是yml文件中配置的值,这种固定配置的ip port不易于现在流行的动态环境中进行配置
	@Value("${user.userServicePath}") 
	private String userServicePath;		
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable("id")Long id){
		return this.restTemple.getForObject(userServicePath+id, User.class);
	}
	
}
