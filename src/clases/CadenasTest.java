package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("cuentaEspacios")
	void testCuentaEspacios(String cadena, int numero) {

		Cadenas frase = new Cadenas(cadena);

		int espacios = frase.cuentaEspacios();

		assertEquals(numero, espacios);

	}

	private static Stream<Arguments> cuentaEspacios() {
		return Stream.of(Arguments.of("Me llamo Ruben", 2), Arguments.of("Jenri es primo de su prima", 5),
				Arguments.of(" ", 1));
	}

	@ParameterizedTest
	@MethodSource("delReves")
	void testDelReves(String cadena, String reves) {
		Cadenas frase = new Cadenas(cadena);

		String resultado = frase.delReves();

		assertEquals(reves, resultado);

	}

	private static Stream<Arguments> delReves() {
		return Stream.of(Arguments.of("Macarena", "aneracaM"), Arguments.of("Auri", "iruA"),
				Arguments.of("Jenri", "irneJ"));
	}

	@ParameterizedTest
	@MethodSource("contarPalabra")
	void testContarPalabra(String cadena, String palabra, int contador) {
		Cadenas frase = new Cadenas(cadena);

		int resultado = frase.contarPalabra(palabra);
		
		assertEquals(contador,resultado);

	}

	private static Stream<Arguments> contarPalabra() {
		return Stream.of(
				Arguments.of("Me gusta Macarena", "Macarena", 1), 
				Arguments.of("Amaro no es amarillo, es Amaro","Amaro",2 ),
				Arguments.of("Jenri tiene toda la cara de ser de Lepe","Auri",0));
	}
}
