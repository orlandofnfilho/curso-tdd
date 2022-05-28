package br.com.gft.calculadora.model.exceptions;

public class NotANumberException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotANumberException(String msg) {
		super(msg);
	}

}
