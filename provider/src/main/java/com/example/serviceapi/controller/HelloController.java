package com.example.serviceapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * com.example.serviceapi.controller
 *
 * @author caofengnian
 * @Date 2020-03-24
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	/**线程睡眠主要演示ribbon的服务重试机制，当超过消费者配置的连接超时时，进行第二次重连
	 * 不接收参数
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String hello() throws InterruptedException {
		int sleep = new Random().nextInt(3000);
		Thread.sleep(sleep);
		return "hello spring cloud";
	}
}
