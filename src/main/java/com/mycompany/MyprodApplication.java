package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hheravan
 *
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MyprodApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyprodApplication.class, args);
	}
}
