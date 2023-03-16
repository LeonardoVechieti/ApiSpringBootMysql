package br.com.leonardovechieti.apispringmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(scanBasePackages = "br.com.leonardovechieti.apispringmysql")
@EntityScan(basePackages = "br.com.leonardovechieti.apispringmysql.model")
public class ApiSpringMysqlApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiSpringMysqlApplication.class, args);
		System.out.println("API Spring MySQL");
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}

}
