package br.com.upe.pIII.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.upe.pIII.Model.Senha;

@Repository
public class SenhaJdbcRepository implements ISenhaRepository{
	
	@Autowired
	private JdbcTemplate dao;
	
	@Override
	public List<Senha> Listar(Long idUsuario) {
		String sql = "SELECT id, senha, apelido, id_usuario FROM senha WHERE id_usuario= ? order by id_usuario, apelido";
		return dao.query(sql, (rs, rowNum) -> Senha.builder().id(rs.getLong("id")).senha(rs.getString("senha"))
		        .apelido(rs.getString("apelido")).idUsuario(rs.getLong("id_usuario")).build(), idUsuario);	
	}	
	
	
}
