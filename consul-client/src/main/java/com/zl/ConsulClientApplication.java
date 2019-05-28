package com.zl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tzxx
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsulClientApplication.class).web(true).run(args);
	}
}