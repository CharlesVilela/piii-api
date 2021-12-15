package br.com.upe.pIII.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.upe.pIII.Model.Configuracao;
import br.com.upe.pIII.Service.GerarSenhaService;

@CrossOrigin
@RequestMapping("/api/v1/")
@RestController
public class GerarSenhaController {

	@Autowired
	private GerarSenhaService service;
	
	@PostMapping("/senha")
	public ResponseEntity<String> gerarSenha(@RequestBody Configuracao configuracao) {
		return new ResponseEntity<String>(service.gerarSenha(configuracao), HttpStatus.CREATED);
	}
	
}
