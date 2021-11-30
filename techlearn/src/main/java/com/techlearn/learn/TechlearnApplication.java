package com.techlearn.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @EnableEurekaClient
 * 
 * @EnableCircuitBreaker
 */
public class TechlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechlearnApplication.class, args);
	}

	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate newTemplate() {
	 * //HttpComponentsClientHttpRequestFactory client = new
	 * HttpComponentsClientHttpRequestFactory(); //client.setConnectTimeout(10000);
	 * return new RestTemplate(); }
	 */

}
