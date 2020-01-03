package com.example.service.api;

import com.example.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * com.example.service.api
 *
 * @author caofengnian
 * @Date 2019-12-10
 */

@FeignClient(value = "eureka-provider")
public interface UserFeignService {

    /**
     * 调用"service-api"服务下的"provider/{name}/hi"接口
     * 此位置的mapping与controller上的mapping是共享全局唯一的，
     * 如果相同会报错ambiguous mapping
     *
     * @param name
     * @return
     */
    @PostMapping("/user/getUser")
    Map<String, Object> getUser(@RequestParam(value = "name") String name, @RequestBody UserDto dto);

}
