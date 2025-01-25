package com.codingcure.userService.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.resolver.dns.DnsNameResolverBuilder;

@Configuration
public class WebclientConfig {
	
	@Bean
	@LoadBalanced
	public WebClient getWebClient(WebClient.Builder builder) {
		return builder.build();
	}

//	DnsNameResolverBuilder builder = new DnsNameResolverBuilder()
//		    .addressResolverGroup(D
}
