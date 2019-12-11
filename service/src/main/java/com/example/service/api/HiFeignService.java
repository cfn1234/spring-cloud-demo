package com.example.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.example.service.api
 *
 * @author caofengnian
 * @Date 2019-12-10
 */
@FeignClient("service-api")
public interface HiFeignService {

    /**
     * 调用"service-api"服务下的"provider/{name}/hi"接口
     * 此位置的mapping与controller上的mapping是共享全局唯一的，
     * 如果相同会报错ambiguous mapping
     *
     * @param name
     * @return
     */
    @RequestMapping("provider/{name}/hi")
    String getHiFeign(@PathVariable(value = "name") String name);
}
