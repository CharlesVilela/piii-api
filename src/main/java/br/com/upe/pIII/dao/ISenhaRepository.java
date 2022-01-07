package br.com.upe.pIII.dao;

import java.util.List;

import br.com.upe.pIII.Model.Senha;

public interface ISenhaRepository {
	
	 List<Senha> Listar(Long idUsuario);

}
