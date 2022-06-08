package com.zl.controller;

import org.springframework.web.bind.annotation.*;

import com.zl.service.ComputeClient;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author tzxx
 */
@RestController
public class ConsumerController {
    @Resource
    private ComputeClient computeClient;

    @PostMapping(value = "/uploadFile")
    public void uploadFile(@RequestPart(value = "file") MultipartFile file, @RequestParam String uploadPath){
        computeClient.uploadFile(file,uploadPath);
    }
}