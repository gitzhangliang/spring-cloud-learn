package com.zl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.service.ComputeService;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author tzxx
 */
@RestController
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private ComputeService computeService;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/add")
    public String add() {
        return computeService.addService();
    }

    @GetMapping(value = "/zipkin")
    public String zipkin() {
        logger.info("===zipkin===");
        return restTemplate.getForEntity("http://server-producer/zipkin", String.class).getBody();
    }


    @GetMapping(value = "/zipkin1")
    public String zipkin1() {
        //和上面接口比较少了log，没有log控制台看不到追踪记录traceid 和 spanid等信息
        return restTemplate.getForEntity("http://server-producer/zipkin", String.class).getBody();
    }
}