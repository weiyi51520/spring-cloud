package com.weiyi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;

@Configuration
public class Configuration1 {
	
	@Bean
    public Contract feignContract() {
		//使用feign的默认配置
        return new feign.Contract.Default();
    }
	
	@Bean
    Logger.Level feignLoggerLevel() {
		//设置feign的日志级别
        return Logger.Level.FULL;
    }
}
