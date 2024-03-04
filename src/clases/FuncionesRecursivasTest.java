package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int expected, int numero) {
		int resultado = FuncionesRecursivas.sumatorio(numero);
		assertEquals(expected, resultado);
	}

	private static Stream<Arguments> sumatorio() {
		return Stream.of(
				Arguments.of(1, 1), 
				Arguments.of(3, 2)

		);
	}

	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(int num, int num2, int expected) {
		double resultado = FuncionesRecursivas.potencia(num,  num2);
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> potencia() {
		return Stream.of(
				Arguments.of(2,2,4), 
				Arguments.of(1,4,1),
				Arguments.of(4,2,16)

		);
	}

	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFibonacci(int num, int expected) {
		int resultado = FuncionesRecursivas.fibonacci(num);
		assertEquals(expected,resultado);
	}
	
	private static Stream<Arguments> fibonacci() {
		return Stream.of(
				Arguments.of(1,1), 
				Arguments.of(20,6765)

		);
	}

}
