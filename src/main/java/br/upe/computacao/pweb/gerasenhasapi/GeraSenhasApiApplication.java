package br.upe.computacao.pweb.gerasenhasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class GeraSenhasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeraSenhasApiApplication.class, args);
	}

}
