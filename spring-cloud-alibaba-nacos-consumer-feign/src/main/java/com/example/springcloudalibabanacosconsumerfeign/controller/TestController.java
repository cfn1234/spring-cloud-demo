package com.example.springcloudalibabanacosconsumerfeign.controller;

import com.example.springcloudalibabanacosconsumerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cfn
 * @date: 2020/12/15 19:51
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	FeignService feignService;

	@PostMapping("test1")
	public String test1(){
		return feignService.test("11");
	}
}
