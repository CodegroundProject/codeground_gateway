package com.esi.codeground;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class CodegroundGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodegroundGatewayApplication.class, args);
	}

	/*@Bean
	public Prefilter prefilter(){
		return new Prefilter();
	}*/
}
