package br.com.upe.pIII.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.upe.pIII.Model.Configuracao;
import br.com.upe.pIII.Model.Senha;
import br.com.upe.pIII.Service.GerarSenhaService;
import br.com.upe.pIII.Service.UsuarioService;

@CrossOrigin("*")
@RequestMapping("/api/v1/")
@RestController
public class GerarSenhaController {

	@Autowired
	private GerarSenhaService service;
	
	@Autowired
	private UsuarioService usuarioDao;
	
	
	@PostMapping("/senha")
	public ResponseEntity<String> gerarSenha(@RequestBody Configuracao configuracao) {
		return new ResponseEntity<String>(service.gerarSenha(configuracao), HttpStatus.CREATED);
	}
	
	@GetMapping("/listar/{idUsuario}")
	public List<Senha> getSenhaAll(@PathVariable Long idUsuario) {
		return service.getAllSenha(idUsuario);
	}
	
}
