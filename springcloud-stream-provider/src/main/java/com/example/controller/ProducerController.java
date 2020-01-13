package com.example.controller;

import com.example.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.controller
 *
 * @author caofengnian
 * @Date 2020-01-13
 */
@RestController
public class ProducerController {
	@Autowired
	private SendService service;
	
	@RequestMapping(value = "/send/{msg}", method = RequestMethod.GET)
	public void send(@PathVariable("msg") String msg){
		service.sendMessage(msg);
	}

}
