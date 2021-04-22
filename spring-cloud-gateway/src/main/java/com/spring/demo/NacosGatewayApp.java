package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务注册
public class NacosGatewayApp {


	public static void main(String[] args) {
		SpringApplication.run(NacosGatewayApp.class,args);
	}
}
