package br.com.gft.calculadora;

import br.com.gft.calculadora.model.entities.Calculadora;
import br.com.gft.calculadora.model.exceptions.NotANumberException;

public class App {

	public static void main(String[] args) {

		try {
			System.out.println(Calculadora.somarInt('a', 5));
		} catch (NotANumberException e) {
			System.out.println("Error: " + e.getMessage());
		}	

	}

}
