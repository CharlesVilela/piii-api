package br.com.upe.pIII.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.upe.pIII.Model.Usuario;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Long>{
	
	
	List<Usuario> findByNome(String nome);
	
}
