package br.com.ex.jsf.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Veiculo {

	@Id
	@GeneratedValue
	private Long Id;
	private String marca;
	private String modelo;
	private String placa;
	
	@ManyToOne
	@JoinColumn ( name = "cod_pessoa" ) 
	private Pessoa pessoa;
	
	@Enumerated( EnumType.STRING )
	private Tipo tipo;
}
