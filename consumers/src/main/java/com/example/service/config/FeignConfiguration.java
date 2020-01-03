package com.example.service.config;

import feign.Contract;
import feign.Logger;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;

/**
 * com.example.service
 *
 * @author caofengnian
 * @Date 2019-12-25
 */
/*@Configuration*/
public class FeignConfiguration {
    // 启用Fegin自定义注解 如@RequestLine @Param
    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    //feign 实现多pojo传输与MultipartFile上传 编码器，需配合开启feign自带注解使用
    @Bean
    public Encoder feignSpringFormEncoder() {
        return new FeignSpringFormEncoder();
    }

    /**
     * 控制全局日志（调试需要）
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}