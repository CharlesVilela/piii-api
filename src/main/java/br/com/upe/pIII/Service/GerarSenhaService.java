package br.com.upe.pIII.Service;

import java.util.ArrayList;
import java.util.List;

import org.passay.CharacterRule;
import org.passay.CharacterData;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.upe.pIII.Model.Configuracao;
import br.com.upe.pIII.Model.Senha;
import br.com.upe.pIII.dao.SenhaDAO;

@Service
public class GerarSenhaService {

	@Autowired
	private SenhaDAO senha;

	public String gerarSenha(Configuracao configuracao) {
		PasswordGenerator gen = new PasswordGenerator();

		
		if(configuracao == null) {
			throw new RuntimeException("Você precisa informar a configuração para gerar a senha!");
		} 
		
		if(configuracao.getMaiuscula() == null && configuracao.getMinuscula() == null && configuracao.getEspeciais() == null && configuracao.getNumeros() == null && configuracao.getTamanho() == null) {
			throw new RuntimeException("Você precisa informar algum parametro de configuração!");
		}
		
		List<CharacterRule> regras = new ArrayList<CharacterRule>();

		int qtd = 0;

		qtd += configuracao.getMaiuscula() ?  1 : 0;
		qtd += configuracao.getMinuscula() ?  1 : 0;
		qtd += configuracao.getNumeros() ?  1 : 0;
		qtd += configuracao.getEspeciais() ?  1 : 0;

		double proporcao = configuracao.getTamanho() / qtd;

		int qtdCracteres = configuracao.getTamanho() % qtd;
		if (configuracao.getMinuscula()) {
			CharacterRule lowerCaseRule = new CharacterRule(EnglishCharacterData.LowerCase);
			qtdCracteres += ((int) proporcao);
			lowerCaseRule.setNumberOfCharacters(qtdCracteres);
			qtdCracteres = 0;
			regras.add(lowerCaseRule);
		}

		if (configuracao.getMaiuscula()) {
			CharacterRule upperCaseRule = new CharacterRule(EnglishCharacterData.UpperCase);
			qtdCracteres += ((int) proporcao);
			upperCaseRule.setNumberOfCharacters(qtdCracteres);
			qtdCracteres = 0;
			regras.add(upperCaseRule);
		}

		if (configuracao.getNumeros()) {
			CharacterRule digitRule = new CharacterRule(EnglishCharacterData.Digit);
			qtdCracteres += ((int) proporcao);
			digitRule.setNumberOfCharacters(qtdCracteres);
			qtdCracteres = 0;
			regras.add(digitRule);
		}

		if (configuracao.getEspeciais()) {
			CharacterData specialChars = new CharacterData() {
				public String getErrorCode() {
					return "ERRONEOUS_SPECIAL_CHARS";
				}

				public String getCharacters() {
					return "!@#$%^&*()_+";
				}
			};

			CharacterRule splCharRule = new CharacterRule(specialChars);
			qtdCracteres += ((int) proporcao);
			splCharRule.setNumberOfCharacters(qtdCracteres);
			regras.add(splCharRule);
		}

		return gen.generatePassword(configuracao.getTamanho(), regras);
	}

	public List<Senha> getAllSenha(Long idUsuario) {
		return this.senha.Listar(idUsuario);
	}

}
