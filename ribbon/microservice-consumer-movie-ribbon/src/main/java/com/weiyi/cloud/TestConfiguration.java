package com.weiyi.cloud;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;

@Configuration
@ExcludeFromComponentScan //加上注解可以防止application扫描同级包 防止user2也变为随机分配访问端口
public class TestConfiguration {
	
	/*@Autowired
	IClientConfig config;*/
	
	@Bean
	public IRule ribbonRule(/*IClientConfig config*/) {
		return new RandomRule(); //指定为随机规则
	}
}
