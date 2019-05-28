package com.zl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.service.ComputeClient;

import javax.annotation.Resource;

/**
 * @author tzxx
 */
@RestController
public class ConsumerController {
    @Resource
    private ComputeClient computeClient;

    @GetMapping(value = "/add")
    public Integer add() {
        return computeClient.add(10, 20);
    }
}