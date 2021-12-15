package br.com.upe.pIII.Service;

import java.util.ArrayList;
import java.util.List;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.stereotype.Service;

import br.com.upe.pIII.Model.Configuracao;

@Service
public class GerarSenhaService {
	
	private static final String ERROR_CODE = "ERRONEOUS_SPECIAL_CHARS";
	
	public String gerarSenha(Configuracao configuracao) {
		
		PasswordGenerator generator = new PasswordGenerator();
		
		List<CharacterRule> regras = new ArrayList<CharacterRule>();
		
		int quantidade = 0;
		
		quantidade = configuracao.getMaiuscula() ? quantidade + 1 : 0;
		quantidade = configuracao.getMinuscula() ? quantidade + 1 : 0;
		quantidade = configuracao.getNumeros() ? quantidade + 1 : 0;
		quantidade = configuracao.getEspeciais() ? quantidade + 1 : 0;
		
		int proporcao = (int) configuracao.getTamanho() / quantidade;
		
		if(configuracao.getMinuscula()) {
			CharacterRule lowerCaseRule = new CharacterRule(EnglishCharacterData.LowerCase);
			lowerCaseRule.setNumberOfCharacters(proporcao);
			regras.add(lowerCaseRule);
		}
		
		if(configuracao.getMaiuscula()) {
			CharacterRule upperCaseRule = new CharacterRule(EnglishCharacterData.UpperCase);
			upperCaseRule.setNumberOfCharacters(proporcao);
			regras.add(upperCaseRule);
		}
		
		if(configuracao.getNumeros()) {
			CharacterRule lowerCaseRule = new CharacterRule(EnglishCharacterData.Digit);
			lowerCaseRule.setNumberOfCharacters(proporcao);
			regras.add(lowerCaseRule);
		}
		
		if(configuracao.getEspeciais()) {
			
		}
		
		return generator.generatePassword(configuracao.getTamanho(), regras);
	}

}
