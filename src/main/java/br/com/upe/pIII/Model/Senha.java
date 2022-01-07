package br.com.upe.pIII.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Senha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="apelido")
	private String apelido;
	
	@Column(name="id_usuario")
	private Long idUsuario;
	

}
