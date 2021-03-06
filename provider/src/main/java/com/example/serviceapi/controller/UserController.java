package com.example.serviceapi.controller;

import com.example.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cfn
 */
@RestController
@RequestMapping(value = "/user", produces = "application/json; charset=utf-8")
public class UserController {

    @PostMapping("/getUser")
    public Map<String, Object> getUser(String name, @RequestBody UserDto user) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("UserDto", user);
        return map;

    }
}
