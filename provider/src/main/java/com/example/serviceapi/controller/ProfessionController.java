package com.example.serviceapi.controller;

import com.example.dto.ProfessionDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caofengnian
 * @Date 2020-01-03
 */
@RestController
@RequestMapping(value = "/profession/", produces = "application/json; charset=utf-8")
public class ProfessionController {

    @PostMapping("/getProfession")
    public Map<String, Object> getProfession(String name, @RequestBody ProfessionDto professionDto) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("professionDto", professionDto);
        return map;
    }
}