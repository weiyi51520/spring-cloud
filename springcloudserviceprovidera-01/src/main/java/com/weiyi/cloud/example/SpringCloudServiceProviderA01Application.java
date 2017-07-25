package com.weiyi.cloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudServiceProviderA01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceProviderA01Application.class, args);
	}
}
