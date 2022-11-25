package com.encora.gateway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentGatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentGatwayApplication.class, args);
	}

//	@Bean
//	public HttpClient httpClient() {
//		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
//	}
}
