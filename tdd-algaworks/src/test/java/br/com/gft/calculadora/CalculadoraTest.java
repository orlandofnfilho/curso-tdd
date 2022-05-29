package br.com.gft.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.com.gft.calculadora.model.entities.Calculadora;
import br.com.gft.calculadora.model.exceptions.NotANumberException;

@TestMethodOrder(OrderAnnotation.class)
class CalculadoraTest {

	@BeforeAll
	static void setup() {
		System.out.println("::::Pré condição::::");
	}

	@BeforeEach
	void testando() {
		System.out.println("Antes de cada um");
	}

	@Test
	@DisplayName("SUM positives => positive")
	@Order(1)
	public void shouldSumPositivesReturnPositive() throws Exception {
		System.out.println("SUM Positives - 1");
		assertSoma();
	}

	private void assertSoma() {
		assertEquals(7, Calculadora.somarInt(5, 2));
	}

	@Test
	@DisplayName("SUM negative plus positive => positive")
	public void shouldSumNegativeAndPositiveResultPositive() throws Exception {
		System.out.println("SUM Positives");
		assertEquals(3, Calculadora.somarInt(-2, 5));
	}

	@Test
	@DisplayName("Multiples Positives")
	public void shouldMultipleBothNumbers() throws Exception {
		System.out.println("Multiples Positives");
		assertEquals(15, Calculadora.multi(3, 5));
	}

	@Test
	@DisplayName("Throw NotANumberException")
	public void shouldThrowNotANumberException() throws Exception {
		System.out.println("Tratando uma exceção");
		assertThrows(NotANumberException.class, () -> Calculadora.somarInt('a', 2), "Testando essa mensagem");
	}

}
