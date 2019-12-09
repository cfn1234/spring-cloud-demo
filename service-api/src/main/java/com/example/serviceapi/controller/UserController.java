package com.example.serviceapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cfn
 */
@RestController
public class UserController {
	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name") String name) {
		return "hi " + name;
	}
}
