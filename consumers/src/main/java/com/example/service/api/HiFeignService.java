package com.example.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.example.service.api
 *
 * @author caofengnian
 * @Date 2019-12-10
 */
@FeignClient(value = "eureka-provider")
public interface HiFeignService {

    /**
     * 调用"service-api"服务下的"provider/{name}/hi"接口
     * 此位置的mapping与controller上的mapping是共享全局唯一的，
     * 如果相同会报错ambiguous mapping
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "provider/hi", method = RequestMethod.GET)
    String getHiFeign(@RequestParam(value = "name") String name);
}
