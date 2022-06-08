package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tzxx
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(OpenFeignConsumerApplication.class, args);
	}
}