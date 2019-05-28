package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**ZipkinStreamServer
 * @author tzxx
 */
@EnableZipkinStreamServer
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinStreamServerApplication {

  public static void main(String[] args) {
  	SpringApplication.run(ZipkinStreamServerApplication.class, args);
  }

}