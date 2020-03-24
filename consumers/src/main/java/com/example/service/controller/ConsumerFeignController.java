package com.example.service.controller;

import com.example.service.api.ServiceProvide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.service.controller
 *
 * @author caofengnian
 * @Date 2019-12-10
 */

@RestController
@RequestMapping(value = "/consumer-feign/", produces = "application/json; charset=utf-8")
public class ConsumerFeignController {
	private static final Logger logger = LoggerFactory.getLogger(ConsumerFeignController.class);
	
	@Autowired
	private ServiceProvide serviceProvide;
	
	/**
	 *      无参数调用
	 *       @return
	 *      
	 */
	@RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
	public String feign() {
		logger.info("start invoke sevice provide");
		return serviceProvide.hello1();
	}
}