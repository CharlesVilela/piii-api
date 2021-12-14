package br.upe.computacao.pweb.gerasenhasapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/")
@RestController
public class GeraSenhasController {

    @PostMapping("/senhas")
    public ResponseEntity<String> gerarSenha(@RequestBody Configuracao configuracao) {
        return new ResponseEntity<String>("gOPsIMXnlPPlCsl", HttpStatus.CREATED);
    }
}
