package com.akak4456.ideal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication(scanBasePackages = {"com.akak4456"})
@EntityScan("com.akak4456.*.domain")
@EnableJpaRepositories("com.akak4456.*.persistent")
public class IdealApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdealApplication.class, args);
	}

}
