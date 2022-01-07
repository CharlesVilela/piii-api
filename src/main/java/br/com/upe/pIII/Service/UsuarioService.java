package br.com.upe.pIII.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.upe.pIII.Model.Usuario;
import br.com.upe.pIII.dao.UsuarioDao;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao dao;
	
	public List<Usuario> findAll(){
		return dao.findAll();
	}

}
