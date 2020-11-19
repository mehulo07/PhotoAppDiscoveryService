package com.makwana.app.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		 for(String arg:args) {
	            System.out.println("Data is :"+arg);
	        }
		SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
	}

}
