package com.zl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author tzxx
 */
@SpringBootApplication
public class StreamApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(StreamApplication.class).web(true).run(args);
	}
}