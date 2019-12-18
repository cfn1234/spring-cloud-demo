package com.example.alibabanacosdiscoveryclientcommon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.example.alibabanacosdiscoveryclientcommon.service
 *
 * @author caofengnian
 * @Date 2019-12-18
 */
@FeignClient(name = "alibaba-nacos-discovery-server")
public interface HelloService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam String name);
}