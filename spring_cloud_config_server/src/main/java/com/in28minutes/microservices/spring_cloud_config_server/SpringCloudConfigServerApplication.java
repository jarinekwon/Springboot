package com.in28minutes.microservices.spring_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

}

/*
#마이크로서비스 및 구성 요소별 포트 정리
Limits Microservice
포트: 8080, 8081, (추가적으로 8082, 8083 등 확장 가능)

Spring Cloud Config Server
포트: 8888

Currency Exchange Microservice
포트: 8000, 8001, 8002 (추가적으로 확장 가능)

Currency Conversion Microservice
포트: 8100, 8101, 8102 (추가적으로 확장 가능)

Netflix Eureka Naming Server
포트: 8761

API Gateway
포트: 8765

Zipkin Distributed Tracing Server
포트: 9411
*/