package br.com.upe.pIII;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@SpringBootApplication
public class ProjetoPiiiApiApplication {

	@Bean
	public RestTemplate restTemplate(List<HttpMessageConverter<?>>
	messageConverters) {
	return new RestTemplate(messageConverters);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoPiiiApiApplication.class, args);
	}

}
