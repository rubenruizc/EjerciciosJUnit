package clases;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("gira90Provider")
    void testGira90(int[][] tablaInicio, int[][] expected) {
        int[][] resultado = Tablas.gira90(tablaInicio);
        assertArrayEquals(expected, resultado);
    }

    static Stream<Arguments> gira90Provider() {
        return Stream.of(
                Arguments.of(new int[][]{{1}}, new int[][]{{1}}),
                Arguments.of(new int[][]{{1, 2}, {3, 4}}, new int[][]{{3, 1}, {4, 2}}),
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}})
        );
    }
}


