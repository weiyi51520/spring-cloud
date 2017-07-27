package com.weiyi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleConsumerApplication {
	
	// 相当于 private RestTemplate restTemplate = new RestTemplate(); 
	//spring 的 IOC
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConsumerApplication.class, args);
	}
}
