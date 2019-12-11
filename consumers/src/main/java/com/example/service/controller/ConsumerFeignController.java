package com.example.service.controller;

import com.example.service.api.HiFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /**
     * 注入微服务Feign Client接口
     */
    @Autowired
    private HiFeignService hiFeignService;

    @RequestMapping("getHiFeign/{name}")
    public String getHiFeign(@PathVariable String name) {
        logger.info("*********getHiFeign name:{}",name);
        //调用微服务接口
        String msg=hiFeignService.getHiFeign(name);
        logger.info("*********getHiFeign msg:{}",msg);
        return msg;
    }
}