package com.zl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tzxx
 */
@RestController
public class ServerController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }

    @GetMapping(value = "/zipkin")
    public String zipkin(HttpServletRequest request) {
        logger.info("=== Compute, TraceId={}, SpanId={}>===", request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
        return "zipkin";
    }

    @PostMapping(value = "/uploadFile")
    public void uploadFile(@RequestPart(value = "file") MultipartFile file, @RequestParam String uploadPath){
        System.out.println(1);
    }
}