package com.example.springcloudalibabanacosconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: cfn
 * @date: 2020/12/14 15:00
 * @description:
 */
@FeignClient(value = "nacos-provider",fallback = FallbackServiceImpl.class)
public interface FeignService {

	@GetMapping(value = "/echo/{string}")
	String test(@PathVariable("string") String string);
}
