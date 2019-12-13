package com.example.serviceapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cfn
 */
@RestController
@RequestMapping(value = "/provider/", produces = "application/json; charset=utf-8")
public class UserController {
	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name") String name) {
		return "hi " + name;
	}
}
