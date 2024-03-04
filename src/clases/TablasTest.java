package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TablasTest {

	@ParameterizedTest
	@MethodSource("esMagica")
	void testEsMagica(int [][] matriz, boolean expected) {
		boolean resultado = Tablas.esMagica(matriz);
		assertEquals(expected, resultado);
	}
	
	static Stream<Arguments> esMagica(){
		return Stream.of(
				Arguments.of(new int[][] {{2,7,6},{9,5,1},{4,3,8}},true),
				Arguments.of(new int[][] {{1,2,3},{4,5,6},{7,8,9}},false),
				Arguments.of(new int[][] {{1,1},{1,2}},false)
				);
	}

	@Test
	void testGira90() {
		fail("Not yet implemented");
	}

}
