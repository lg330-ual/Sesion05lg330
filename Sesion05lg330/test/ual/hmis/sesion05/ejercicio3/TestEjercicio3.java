package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestEjercicio3 {

	@ParameterizedTest
	@CsvFileSource(resources = "./data.csv", numLinesToSkip = 1)
	public void testMaskedPassword(String password, String expected) {
		// Arrange
		Ejercicio3 ej3 = new Ejercicio3();
		// Assert
		assertEquals(expected, ej3.maskPassword(password));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "./data1.csv", numLinesToSkip = 1)
	public void testMasjedPasswordEntre5y8(String password, String expected) {
		// Arrange
		Ejercicio3 ej3 = new Ejercicio3();
		// Assert
		assertEquals(expected, ej3.maskPassword(password));
	}

}
