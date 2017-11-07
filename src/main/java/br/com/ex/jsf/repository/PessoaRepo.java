package br.com.ex.jsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ex.jsf.model.Pessoa;

public interface PessoaRepo extends JpaRepository<Pessoa, Long> {

}
