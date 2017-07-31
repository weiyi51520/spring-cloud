package com.weiyi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerMovieRibbonApplication {
	
	// 相当于 private RestTemplate restTemplate = new RestTemplate(); 
	//spring 的 IOC
	@Bean
	@LoadBalanced //整合ribbon 具备ribbon负载均衡的能力
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonApplication.class, args);
	}
}
