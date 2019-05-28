package com.zl;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinStreamClient {

	private final Logger logger = Logger.getLogger(getClass());


	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping(value = "/zipkin", method = RequestMethod.GET)
	public String zipkin() {
		logger.info("===<call ZipkinClient1>===");
		return restTemplate().getForEntity("http://server-producer/zipkin", String.class).getBody();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZipkinStreamClient.class, args);
	}

}
