package br.com.upe.pIII.Model;

import lombok.Data;

@Data
public class Configuracao {
	
	private Integer tamanho;
	private Boolean maiuscula;
	private Boolean minuscula;
	private Boolean numeros;
	private Boolean especiais;
	public Integer getTamanho() {
		return tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	public Boolean getMaiuscula() {
		return maiuscula;
	}
	public void setMaiuscula(Boolean maiuscula) {
		this.maiuscula = maiuscula;
	}
	public Boolean getMinuscula() {
		return minuscula;
	}
	public void setMinuscula(Boolean minuscula) {
		this.minuscula = minuscula;
	}
	public Boolean getNumeros() {
		return numeros;
	}
	public void setNumeros(Boolean numeros) {
		this.numeros = numeros;
	}
	public Boolean getEspeciais() {
		return especiais;
	}
	public void setEspeciais(Boolean especiais) {
		this.especiais = especiais;
	}
}
