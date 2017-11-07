package br.com.ex.jsf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long Id;
	private String nome;
	private String cpf;

}
