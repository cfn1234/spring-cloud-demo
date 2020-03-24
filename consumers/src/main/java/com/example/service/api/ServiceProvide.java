package com.example.service.api;

import com.example.service.fallback.ServiceProvideFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.example.service.api
 *
 * @author caofengnian
 * @Date 2020-03-24
 */
@FeignClient(value = "eureka-provider", fallback = ServiceProvideFallBack.class)
public interface ServiceProvide {
	@RequestMapping(value = "/hello/hello1", method = RequestMethod.GET)
	String hello1();
}
