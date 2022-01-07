package br.com.upe.pIII.Model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Configuracao implements Serializable{
	
	private Integer tamanho;
	private Boolean maiuscula;
	private Boolean minuscula;
	private Boolean numeros;
	private Boolean especiais;
}
