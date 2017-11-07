package br.com.ex.jsf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ex.jsf.model.Pessoa;
import br.com.ex.jsf.repository.PessoaRepo;
import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
public class PessoaController {
	
	@Autowired
	PessoaRepo pessoaRepo;
	
	
	@Getter @Setter
	private List<Pessoa> pessoas = new ArrayList<>();
	
	@PostConstruct
	public void iniciar(){
		
		this.pessoas = pessoaRepo.findAll();
		
	}
	


}
