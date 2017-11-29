package br.com.ex.jsf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.ex.jsf.model.Pessoa;
import br.com.ex.jsf.repository.PessoaRepo;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class PessoaController {
	
	@Inject
	private PessoaRepo pessoaRepo;
	
	
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	@PostConstruct
	public void iniciar(){
		
		this.pessoas = pessoaRepo.findAll();
		
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	


}
