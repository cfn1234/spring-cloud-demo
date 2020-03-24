package com.example.service.fallback;

import com.example.service.api.ServiceProvide;
import org.springframework.stereotype.Component;

/**
 * com.example.service.fallback
 *
 * @author caofengnian
 * @Date 2020-03-24
 */
@Component
public class ServiceProvideFallBack implements ServiceProvide {
	
	@Override
	public String hello1() {
		return "hello1 invoke fail";
	}
}
