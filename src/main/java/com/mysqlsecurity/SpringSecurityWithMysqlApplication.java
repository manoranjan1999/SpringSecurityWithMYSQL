package com.mysqlsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mysqlsecurity.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithMysqlApplication.class, args);
	}

}
