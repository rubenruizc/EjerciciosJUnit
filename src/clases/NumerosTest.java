package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("esPrimo")
	void testEsPrimo(boolean expected, int numero) {
		Numeros n = new Numeros(numero);
		boolean resultado = n.esPrimo();
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> esPrimo() { 
		return Stream.of(
			  Arguments.of(true, 3), 
			  Arguments.of(false, 2)
			 
			  ); }

	@Test
	void testEsCapicua() {
		fail("Not yet implemented");
	}


}

/*
 * @ParameterizedTest
 * 
 * @MethodSource("sumatorio") void testSumatorio(int expected, int numero) { int
 * resultado = FuncionesRecursivas.sumatorio(numero); assertEquals(expected,
 * resultado); }
 * 
 * private static Stream<Arguments> sumatorio() { return Stream.of(
 * Arguments.of(1, 1), Arguments.of(3, 2)
 * 
 * ); }
 */