package br.com.leonardovechieti.apispringmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.leonardovechieti.apispringmysql")
@EntityScan(basePackages = "br.com.leonardovechieti.apispringmysql.model")
public class ApiSpringMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringMysqlApplication.class, args);
	}

}
