package br.com.ex.jsf.controller.helper;

import javax.faces.FacesException;

import br.com.ex.jsf.model.Pessoa;


public class Sorter {
	
	 public int ordenarNome(Object obj1, Object obj2) {
	        try {
	        	Pessoa p1 = (Pessoa) obj1;
	        	Pessoa p2 = (Pessoa) obj2;
	            
	            String value1 = p1.getNome();
	            
	            String value2 = p2.getNome();

	          int result = value1.compareToIgnoreCase(value2);
	            
	           return result;

	        } catch (Exception e) {
	            throw new FacesException(e);
	        }
	    }

}
