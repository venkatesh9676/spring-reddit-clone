package com.spring.reddit.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import com.spring.reddit.clone.config.SwaggerConfiguration;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringRedditCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.spring.reddit.clone.SpringRedditCloneApplication.class, args);
	}
	
}
