package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class MsMyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMyClientApplication.class, args);
	}

}
