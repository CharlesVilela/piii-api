package br.com.upe.pIII.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.upe.pIII.Model.Senha;

@Repository
public interface SenhaJpaRepository extends JpaRepository<Senha, Long>{

}
