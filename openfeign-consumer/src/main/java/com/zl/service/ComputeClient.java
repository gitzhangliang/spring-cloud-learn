package com.zl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author tzxx
 */
@FeignClient(url = "http://localhost:2223",value = "s")
public interface ComputeClient {
    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    void uploadFile(@RequestPart(value = "file") MultipartFile file, @RequestParam(value = "uploadPath") String uploadPath);
}