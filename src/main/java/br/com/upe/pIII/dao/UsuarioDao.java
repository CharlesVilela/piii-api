package br.com.upe.pIII.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.upe.pIII.Model.Usuario;

@Component
public class UsuarioDao {
	
	@Autowired
	private UsuarioJpaRepository repository;
	
	
	public String Save(Usuario usuario) {
		repository.save(usuario);
		return "Salvo com sucesso!";
	}
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Usuario findById(Long id) {
		return repository.getById(id);
	}
	
	public String delete(Long id) {
		 repository.deleteById(id);
		 return "Deletado com sucesso!";
	}
	

}
