package com.example.springcloudalibabanacosconsumerfeign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: cfn
 * @date: 2020/12/15 19:29
 * @description:
 */
@Component
public class FallbackServiceImpl implements FeignService{


	@Override
	public String test(String string) {
		return "test fallback";
	}
}
