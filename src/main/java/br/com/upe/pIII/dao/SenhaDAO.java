package br.com.upe.pIII.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.upe.pIII.Model.Senha;

@Component
public class SenhaDAO {
	
	@Autowired
	private ISenhaRepository repositoryJDBC;
	
	public List<Senha> Listar(Long id) {
		return repositoryJDBC.Listar(id);
	}
	
}
