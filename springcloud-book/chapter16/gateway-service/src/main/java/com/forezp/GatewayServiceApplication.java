package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
<<<<<<< HEAD
@EnableZuulProxy			// 使能Zuul Proxy
@EnableEurekaClient			// 使能Eureka Client
=======
@EnableZuulProxy				// 使能Zuul
@EnableEurekaClient				// 使能Eureka Client
>>>>>>> 91c374498d3627edeb20b28040dff2773e94b147
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
