package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * 类 描 述：TODO
 * 创建时间：2020/1/13 10:23 上午
 * 创 建 人：cfn
 * 生产者消费
 **/
@EnableBinding(Source.class)
public class SendService {
	
	@Autowired
	private Source source;
	
	public void sendMessage(String msg) {
		try {
			source.output().send(MessageBuilder.withPayload(msg).build());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}