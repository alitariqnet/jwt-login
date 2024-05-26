package dev.ali.jwtlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtloginApplication.class, args);
	}

}
