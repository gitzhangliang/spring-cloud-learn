package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzxx
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ServerProducer1ClusterApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerProducer1ClusterApplication.class, args);
	}
}