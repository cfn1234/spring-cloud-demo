package com.example.alibabanacosdiscoveryclientcommon.controller;

import com.example.alibabanacosdiscoveryclientcommon.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.alibabanacosdiscoveryclientcommon.controller
 *
 * @author caofengnian
 * @Date 2019-12-18
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/test")
    public String test() {
        String url = helloService.hello("1111");
        return "Invoke : " + url;
    }
}