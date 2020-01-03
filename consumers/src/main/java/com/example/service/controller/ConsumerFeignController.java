package com.example.service.controller;

import com.example.dto.UserDto;
import com.example.service.api.UserFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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
    private UserFeignService hiFeignService;


    @RequestMapping("getHiFeign/{name}")
    public Map<String, Object> getHiFeign(@PathVariable String name) {
        logger.info("*********getHiFeign name:{}", name);
        //调用微服务接口
        UserDto userDto = new UserDto();
        userDto.setId(11);
        userDto.setName("hai");
        Map<String, Object> msg = hiFeignService.getUser(name, userDto);
        logger.info("*********getHiFeign msg:{}", msg);
        return msg;
    }
}