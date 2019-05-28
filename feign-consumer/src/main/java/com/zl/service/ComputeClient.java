package com.zl.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tzxx
 */
@FeignClient(value = "server-producer", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    /**加
     * @param a int
     * @param b int
     * @return int
     */
    @GetMapping(value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}