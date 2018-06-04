package com.example.MicroServiceConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroServiceConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("third commit for new branch MIC-2");
		SpringApplication.run(MicroServiceConfigServerApplication.class, args);
	}
}
