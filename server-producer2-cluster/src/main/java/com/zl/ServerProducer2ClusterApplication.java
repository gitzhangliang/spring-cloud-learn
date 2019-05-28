package com.zl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tzxx
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ServerProducer2ClusterApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerProducer2ClusterApplication.class).web(true).run(args);
	}
}