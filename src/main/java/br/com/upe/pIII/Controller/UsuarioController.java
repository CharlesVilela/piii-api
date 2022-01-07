package br.com.upe.pIII.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.upe.pIII.Model.Usuario;
import br.com.upe.pIII.Service.UsuarioService;

@CrossOrigin("*")
@RequestMapping("/api/v1/")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> findAll(){
		
		ResponseEntity resposta = null;  
		
		List<Usuario> lista = service.findAll();
		
		if (lista == null || lista.isEmpty()) {
			resposta = new ResponseEntity(HttpStatus.NOT_FOUND);
		} else {
			resposta = new ResponseEntity<List<Usuario>>(service.findAll(), HttpStatus.FOUND);
		}
		return resposta;
	}

}
