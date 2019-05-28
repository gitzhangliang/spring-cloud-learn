package com.zl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tzxx
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCluster1Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerCluster1Application.class).web(true).run(args);
	}
}