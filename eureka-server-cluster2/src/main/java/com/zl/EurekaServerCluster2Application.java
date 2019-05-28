package com.zl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tzxx
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerCluster2Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerCluster2Application.class).web(true).run(args);
	}
}