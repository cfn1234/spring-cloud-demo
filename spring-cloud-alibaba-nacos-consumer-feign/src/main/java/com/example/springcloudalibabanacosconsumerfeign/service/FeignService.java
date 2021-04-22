package com.example.springcloudalibabanacosconsumerfeign.service;

import com.example.springcloudalibabanacosconsumerfeign.entity.MapsVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: cfn
 * @date: 2020/12/14 15:00
 * @description:
 */
@FeignClient(value = "nacos-provider")
public interface FeignService {

	@GetMapping(value = "/echo/{string}")
	MapsVO test(@PathVariable("string") String string);
}
