package com.zl.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author tzxx
 */
@RestController
public class ServerController {

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

    @GetMapping(value = "/zipkin")
    public String zipkin() {
        return "zipkin";
    }
}