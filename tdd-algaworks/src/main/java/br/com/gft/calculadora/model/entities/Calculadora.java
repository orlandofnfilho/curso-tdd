package br.com.gft.calculadora.model.entities;

import br.com.gft.calculadora.model.exceptions.NotANumberException;

public class Calculadora {

	public static int somarInt(int x, int y) {
		if (x == 'a')
			throw new NotANumberException("Não é um numero");
		return x + y;
	}

	public static int subint(int x, int y) {
		return x - y;
	}

	public static int multi(int x, int y) {
		return x * y;
	}
}
